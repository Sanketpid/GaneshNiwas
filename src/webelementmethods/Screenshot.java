package webelementmethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\11th dec\\chromedriver_win32//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(200);
	driver.manage().window().maximize();
	Thread.sleep(200);
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File desination= new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Software Testing\\Seleniumscreenshot\\myscreenshot.png");
	FileHandler.copy(source, desination);
}}
