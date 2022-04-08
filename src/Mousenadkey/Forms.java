package Mousenadkey;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Forms {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demoqa.com/automation-practice-form");
	//driver.manage().window().maximize();
	Thread.sleep(200);
	Actions act= new Actions(driver);
	//act.sendKeys(Keys.TAB).perform();
	driver.findElement(By.xpath("//*[@id=\"close-fixedban\"]/img")).click();Thread.sleep(500);
	WebElement Firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));Thread.sleep(500);
	act.click(Firstname).sendKeys("sanket").build().perform();Thread.sleep(500);
	act.sendKeys(Keys.TAB).sendKeys("Pidurkar").build().perform();Thread.sleep(500);
	act.sendKeys(Keys.TAB).sendKeys("sgp@gmail.com").build().perform();Thread.sleep(500);
	act.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_RIGHT).build().perform();Thread.sleep(500);
    act.sendKeys(Keys.TAB).sendKeys("9923252274").build().perform();Thread.sleep(500);
    act.sendKeys(Keys.TAB).sendKeys("14 Dec 1995").sendKeys(Keys.ENTER).build().perform();Thread.sleep(500);
    act.sendKeys(Keys.TAB).sendKeys("Ma").sendKeys(Keys.ENTER).build().perform();Thread.sleep(500);
    act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).build().perform();Thread.sleep(500);
    act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("ballarpur").build().perform();Thread.sleep(500);
    act.sendKeys(Keys.TAB).sendKeys("Ha").sendKeys(Keys.ENTER).build().perform();Thread.sleep(500);
    act.sendKeys(Keys.TAB).sendKeys("Ka").sendKeys(Keys.ENTER).build().perform();Thread.sleep(500);
    act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();Thread.sleep(500);
    driver.findElement(By.xpath("//*[@id=\":4h\"]"));
}
}
