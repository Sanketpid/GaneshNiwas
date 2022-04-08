package practice;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Sroll {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.youtube.com/");
    
    Thread.sleep(200);
    TakesScreenshot t = ((TakesScreenshot)driver);
    File snap = t.getScreenshotAs(OutputType.FILE);
    String s =RandomString.make(2);
    File dest= new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Software Testing\\Seleniumscreenshot\\snap"+s+".png");
    FileHandler.copy(snap, dest);
    System.out.println(snap);
    JavascriptExecutor j= ((JavascriptExecutor)driver);
    j.executeScript("scroll(0,100)");Thread.sleep(200);
    j.executeScript("scroll(0,200)");Thread.sleep(200);
    j.executeScript("scroll(0,300)");Thread.sleep(200);
    j.executeScript("scroll(0,400)");Thread.sleep(200);
    j.executeScript("scroll(0,500)");Thread.sleep(200);
    j.executeScript("scroll(0,600)");Thread.sleep(200);
    j.executeScript("scroll(0,700)");Thread.sleep(200);
    j.executeScript("scroll(0,800)");Thread.sleep(200);
    j.executeScript("scroll(0,900)");Thread.sleep(200);
    j.executeScript("scroll(0,1000)");Thread.sleep(200);
    j.executeScript("scroll(0,1100)");Thread.sleep(200);
    j.executeScript("scroll(0,1200)");
    File snap2=t.getScreenshotAs(OutputType.FILE);
    FileHandler.copy(snap2, dest);
    System.out.println(snap2);
    
    
}
}
