package Seleandexel;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		Zerodha z= new Zerodha();
		z.zerodha();

	}
	
	
	
	
	
public void zerodha() throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream myFile= new FileInputStream("C:\\11th dec\\Book1.xlsx");
	
	Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
	
	String username = mysheet.getRow(0).getCell(0).getStringCellValue();
	System.out.println(username);
	
	String password = mysheet.getRow(0).getCell(1).getStringCellValue();
	
	String pin = mysheet.getRow(0).getCell(2).getStringCellValue();
		
System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/");
	
	Thread.sleep(1000);
	
	WebElement usernameField = driver.findElement(By.id("userid"));
	
	WebElement passwordfield = driver.findElement(By.id("password"));
	
	WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	
	usernameField.sendKeys(username);
	
	passwordfield.sendKeys(password);
	
	loginButton.click();
	
	Thread.sleep(2000);
	
	WebElement pinfield = driver.findElement(By.id("pin"));
	
	WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
	
	pinfield.sendKeys(pin);
	
	continueButton.click();
	
	Thread.sleep(1000);
	
	WebElement usernameText = driver.findElement(By.xpath("//span[@class='user-id']"));
	
	String actualText = usernameText.getText();
	
	String expectedText = username;
	
	
	if(actualText.equals(expectedText)) {
		
		System.out.println("Test data matched Test case is passed");
		
	}
	else {
		
		System.out.println("Test data not matched Test case is faild");
		
	}
	usernameText.click();
	WebElement logout = driver.findElement(By.xpath("//a[@target='_self']"));
	logout.click();
	driver.close();
}
}
