package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement dragme = driver.findElement(By.id("draggable"));
	    Thread.sleep(200);
		WebElement dropme = driver.findElement(By.id("droppable"));
	    Actions act= new Actions(driver);
	    act.dragAndDrop(dragme, dropme).perform();
	}

}
