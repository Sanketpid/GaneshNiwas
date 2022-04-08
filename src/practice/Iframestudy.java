package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframestudy {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
		    
			WebDriver driver=new ChromeDriver();
		    
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			driver.manage().window().maximize();
			Thread.sleep(200);
			driver.switchTo().frame("courses-iframe");
			
			
			Thread.sleep(200);
			WebElement velocityfoundation = driver.findElement(By.xpath("//a[text()='Velocity Foundation']"));
			Thread.sleep(200);
			velocityfoundation.click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			WebElement button = driver.findElement(By.xpath("//label[text()='Radio1']"));
		    button.click();
            
			Thread.sleep(200);
		    JavascriptExecutor j= ((JavascriptExecutor)driver);
		    j.executeScript("scroll(0,100)");
		    Thread.sleep(200);
		    driver.manage().deleteAllCookies();
	}

}
