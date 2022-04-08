package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhawithoutDDF {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		
		WebElement usernameField = driver.findElement(By.id("userid"));
		
		WebElement password = driver.findElement(By.id("password"));
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		usernameField.sendKeys("IJ4051");
		
		password.sendKeys("Sanket@123");
		
		loginButton.click();
		
		Thread.sleep(2000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("992325");
		
		continueButton.click();
		
		Thread.sleep(1000);
		
		WebElement usernameText = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String actualText = usernameText.getText();
		
		String expectedText = "IJ4051";
		
		if(actualText.equals(expectedText)) {
			
			System.out.println("Test data matched Test case is passed");
			
		}
		else {
			
			System.out.println("Test data matched Test case is faild");
			
		}
		usernameText.click();
		WebElement logout = driver.findElement(By.xpath("//a[@target='_self']"));
		logout.click();
		driver.close();
		

	}

}
