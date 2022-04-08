package sanket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sanfac {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
	WebDriver chrome =new ChromeDriver();
chrome.get("https://www.facebook.com/");
chrome.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
Thread.sleep(2000);
chrome.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Amey");
}
}
