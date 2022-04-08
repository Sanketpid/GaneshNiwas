package practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setposit {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
    
	WebDriver driver=new ChromeDriver();
    
	driver.get("https://vctcpune.com/selenium/practice.html");

	driver.manage().window().setPosition(new Point(800, 100));Thread.sleep(1000);
	System.out.println(driver.manage().window().getPosition().getX());
	System.out.println(driver.manage().window().getPosition().getY());
	driver.manage().window().setPosition(new Point(900,200));Thread.sleep(1000);
	System.out.println(driver.manage().window().getPosition().getX());
	System.out.println(driver.manage().window().getPosition().getY());
	driver.manage().window().setPosition(new Point(1000, 300));Thread.sleep(1000);
	System.out.println(driver.manage().window().getPosition().getX());
	System.out.println(driver.manage().window().getPosition().getY());
	driver.manage().window().setPosition(new Point(1100, 400));Thread.sleep(1000);
	System.out.println(driver.manage().window().getPosition().getX());
	System.out.println(driver.manage().window().getPosition().getY());
	driver.manage().window().setPosition(new Point(1200, 500));Thread.sleep(1000);
	System.out.println(driver.manage().window().getPosition().getX());
	System.out.println(driver.manage().window().getPosition().getY());
	driver.manage().window().setPosition(new Point(1300, 600));
	System.out.println(driver.manage().window().getPosition().getX());
	System.out.println(driver.manage().window().getPosition().getY());
}
}
