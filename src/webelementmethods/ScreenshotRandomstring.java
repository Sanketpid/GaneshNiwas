package webelementmethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
///import org.openqa.selenium.io.FileHandler;

//import net.bytebuddy.utility.RandomString;

public class ScreenshotRandomstring {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\11th dec\\chromedriver_win32//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(200);
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	//ScreenshotRandomstring name= new ScreenshotRandomstring();
	//File desti= new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Software Testing\\Seleniumscreenshot\\mysnapshot"+name+".png");
	//FileHandler.copy(source, desti);
	
}
}
