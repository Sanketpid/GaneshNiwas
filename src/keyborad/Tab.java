package keyborad;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab {

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
		 act.sendKeys(Keys.TAB).keyDown(Keys.SHIFT).sendKeys("pidurkar").keyUp(Keys.SHIFT).build().perform();
		 act.sendKeys(Keys.TAB).sendKeys("xyz123@gmail.com").build().perform();
		 act.sendKeys(Keys.TAB).sendKeys("xyz123@gmail.com").build().perform();
		 act.sendKeys(Keys.TAB).sendKeys("992325@qwerty").build().perform();
		 act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		 for(int i=0;i<=9;i++) {
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 }
		 act.sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();
		 Thread.sleep(200);
         act.sendKeys(Keys.TAB).perform();
		 for(int i=0;i<=8;i++) {
			 act.sendKeys(Keys.ARROW_DOWN).perform();
			 }
		 act.sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();
		 Thread.sleep(200);
		 act.sendKeys(Keys.TAB).perform();
		 for(int i=0;i<=26;i++) {
			 act.sendKeys(Keys.ARROW_DOWN).perform();
			 }
		 act.sendKeys(Keys.ENTER).sendKeys(Keys.TAB).build().perform();
         act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.SPACE).build().perform();
		 act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		 Thread.sleep(5000);
	}

}
