package sanket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_code2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://meet.google.com/?authuser=0");
//driver.close();//By using close method we can close current tab
//driver.get("https://www.youtube.com/");
//driver.quit();
	driver.manage().window().maximize();
	Thread.sleep(5000);
    driver.navigate().to("https://www.youtube.com/");
    Thread.sleep(5000);
    driver.navigate().back();
    Thread.sleep(5000);
    driver.navigate().forward();
    Thread.sleep(5000);
    driver.navigate().refresh();
    
}
}
