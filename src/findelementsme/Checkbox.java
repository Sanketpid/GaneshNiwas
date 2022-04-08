package findelementsme;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		WebElement srollele = driver.findElement(By.xpath("//legend[text()='Checkbox Example']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", srollele);
		List<WebElement> Allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(Allcheckboxes.size());
		for(WebElement w:Allcheckboxes) {
			Thread.sleep(2000);
			System.out.println(w.getText());
			w.click();
			System.out.println(w.isSelected());
			
		}
		for(WebElement w:Allcheckboxes) {
			System.out.println(w.getText());
			w.click();
			System.out.println(w.isSelected());
			
		}
		

	}

}
