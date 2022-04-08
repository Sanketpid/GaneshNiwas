package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollintoview {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://vctcpune.com/selenium/practice.html");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    WebElement Checkboxopt1 = driver.findElement(By.id("checkBoxOption1"));
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("arguments[0].scrollIntoView();",Checkboxopt1);
    //JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("arguments[0].scrollIntoView();", Checkboxopt1);
    Checkboxopt1.click();
    
}
}
