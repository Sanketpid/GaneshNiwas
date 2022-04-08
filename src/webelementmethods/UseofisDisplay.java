package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class UseofisDisplay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement textboxstatus = driver.findElement(By.id("displayed-text"));
        boolean result = textboxstatus.isDisplayed();
        if(result) {
        	System.out.println("text box is active");
        }
        Thread.sleep(2000);
        WebElement Hidebutton = driver.findElement(By.id("hide-textbox"));
        Hidebutton.click();
        Thread.sleep(2000);
        boolean result2 = textboxstatus.isDisplayed();
        System.out.println("After clicking on Hide button th output is");
        if(result2) {
        	System.out.println("Text box is active");
        	
        }
        else {
        	System.out.println("Text box is inactive");
        }
        Thread.sleep(2000);
        driver.quit();
	}

}
