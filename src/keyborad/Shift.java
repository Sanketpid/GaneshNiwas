package keyborad;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shift {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
	//driver.manage().window().maximize();
	Thread.sleep(200);
	WebElement CreateAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	Actions act= new Actions(driver);
	act.moveToElement(CreateAccount).click().build().perform();
	Thread.sleep(2200);
	WebElement Firstname = driver.findElement(By.name("firstname"));
	
	act.click(Firstname).keyDown(Keys.SHIFT).sendKeys("SaNket").keyUp(Keys.SHIFT).build().perform();
	Thread.sleep(2000);
	//act.keyDown(Keys.TAB).keyUp(Keys.TAB).click().keyDown(Keys.SHIFT).sendKeys("Sanket").build().perform();
	//act.click(Firstname).keyDown(Keys.SHIFT).sendKeys("velocity").build().perform();.keyUp(Keys.SHIFT)
	
	 act.sendKeys(Keys.TAB).sendKeys("pidurkar").build().perform();
	 
}
}
