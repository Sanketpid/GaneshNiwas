package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframe {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demoqa.com/nestedframes");
    Thread.sleep(200);
    driver.manage().window().maximize();
    Thread.sleep(200);
    //entering in frame1-parent frame
    driver.switchTo().frame("frame1");//enter in frame 1 by (name or id)
	WebElement parent = driver.findElement(By.xpath("//body[text()='Parent frame'] "));
	System.out.println(parent.getText());
	//entering in frame2-child frame
	WebElement childframeentry = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));// to enter in child frame we dont have name or id.
	driver.switchTo().frame(childframeentry);//by frame(webelement)
	WebElement childtext = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
	System.out.println(childtext.getText());
	//again going back in frame 1-parent frame
    driver.switchTo().parentFrame();
	System.out.println(parent.getText());
    driver.switchTo().defaultContent();
    
    
    
    
    
}
}
