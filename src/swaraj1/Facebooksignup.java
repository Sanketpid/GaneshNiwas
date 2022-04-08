package swaraj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooksignup {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
			WebDriver chrome =new ChromeDriver();
	chrome.get("https://www.facebook.com/");
	Thread.sleep(2000);
	chrome.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
Thread.sleep(2000);
chrome.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sanket");
Thread.sleep(2000);
chrome.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pidurkar");
Thread.sleep(2000);
chrome.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Pidurkar");
Thread.sleep(2000);
chrome.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Sanket@123");
Thread.sleep(2000);
chrome.findElement(By.xpath("//select[@name='birthday_day']")).click();
Thread.sleep(2000);
chrome.findElement(By.xpath("//option[@value=\"14\"]")).click();
Thread.sleep(2000);
chrome.findElement(By.xpath("//select[@name='birthday_month']")).click();
Thread.sleep(2000);
chrome.findElement(By.xpath("//option[@value=\"14\"]")).click();
Thread.sleep(2000);
chrome.findElement(By.xpath("//option[@value=\"14\"]")).click();
Thread.sleep(2000);
	}

}
