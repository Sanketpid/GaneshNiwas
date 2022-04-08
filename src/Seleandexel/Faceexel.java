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

public class Faceexel {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\11th dec\\chromedriver_win32//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement usernamefield = driver.findElement(By.id("email"));
	WebElement passwordfield = driver.findElement(By.id("pass"));
	FileInputStream myfile= new FileInputStream("C:\\11th dec\\Book1.xlsx");
	Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
	int numofrow = sheet.getLastRowNum();
	for(int i=0;i<=numofrow;i++) {
		String username = sheet.getRow(i).getCell(0).getStringCellValue();
		String pass = sheet.getRow(i).getCell(1).getStringCellValue();
		
		usernamefield.sendKeys(username);
		Thread.sleep(2000);
		passwordfield.sendKeys(pass);
		Thread.sleep(2000);
		usernamefield.clear();
		Thread.sleep(2000);
		passwordfield.clear();
		}
			
	}
	

}
