package swaraj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sankey {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
		WebDriver chrome =new ChromeDriver();
chrome.get("https://kite.zerodha.com/");
Thread.sleep(2000);
chrome.findElement(By.xpath("//input[@id='userid']")).sendKeys("IJ4051");
Thread.sleep(2000);
chrome.findElement(By.xpath("//input[@id='password']")).sendKeys("Sanket@123");
Thread.sleep(2000);
chrome.findElement(By.xpath("//button[@class='button-orange wide']")).click();
Thread.sleep(2000);
chrome.findElement(By.xpath("//input[@id='pin']")).sendKeys("992325");

chrome.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	}
}
