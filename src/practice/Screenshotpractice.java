package practice;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshotpractice {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.youtube.com/");
    Thread.sleep(200);
    driver.manage().window().minimize();
    driver.manage().window().setPosition(new Point(-8, -8));
    Thread.sleep(2000);
    driver.manage().window().setPosition(new Point(1000, 100));
    Thread.sleep(200);
    
    driver.manage().window().maximize();
    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    RandomString s1= new RandomString(2);
    File distination = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Software Testing\\Seleniumscreenshot\\snap"+s1);
    FileHandler.copy(source, distination);
    System.out.println(driver.manage().window().getPosition().getX());
    System.out.println(driver.manage().window().getPosition().getY());
   Dimension d =new Dimension(2000, 800);
    driver.manage().window().setSize(d);
	}

}
