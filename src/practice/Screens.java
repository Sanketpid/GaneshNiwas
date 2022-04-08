package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screens {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	TakesScreenshot TS = (TakesScreenshot)driver;
	File source =TS.getScreenshotAs(OutputType.FILE);
	String s= RandomString.make(2);
	File dest1= new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Software Testing\\Seleniumscreenshot\\screenshot"+s+".png");
    FileHandler.copy(source, dest1);
    
    File source2= TS.getScreenshotAs(OutputType.FILE);
    FileHandler.copy(source2, dest1);
    
     
  
}
}
