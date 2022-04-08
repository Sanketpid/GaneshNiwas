package sanket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
		WebDriver chrome =new ChromeDriver();
	chrome.get("https://meet.google.com/?authuser=0");
	Thread.sleep(2000);
    chrome.findElement(By.xpath("//i[@aria-hidden='true']")).click();
	}

}
