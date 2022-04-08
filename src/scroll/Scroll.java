package scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.youtube.com/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,1200)");
    JavascriptExecutor js = (JavascriptExecutor)driver;
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-120)");
    
}
}
