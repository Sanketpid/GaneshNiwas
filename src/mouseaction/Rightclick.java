package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	Thread.sleep(200);
	WebElement rightclickme = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions act = new Actions(driver);
	//if you use below syntax is contextClick(webelement),
    //no need to use movemoveToElement(webelement)
	
	//act.contextClick(rightclickme).perform();
	
	//if you use below syntax is contextClick(),
    // need to use movemoveToElement(webelement) 
	
	act.moveToElement(rightclickme).contextClick().perform();
}
}
