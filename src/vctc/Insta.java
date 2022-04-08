package vctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.instagram.com/");
Thread.sleep(200);
driver.manage().window().maximize();
Thread.sleep(200);
WebElement Userid =driver.findElement(By.name("username"));


Userid.sendKeys("pankaj1995");
Thread.sleep(100);
Userid.click();
Thread.sleep(100);
Userid.clear();

}
	}


