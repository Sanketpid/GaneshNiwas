package findelementsme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ratings {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "C:\\11th dec\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement popupclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		popupclose.click();
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("iphone 13 pro max");
		WebElement Searchbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		Searchbutton.click();
		Thread.sleep(2000);
		WebElement ratings = driver.findElement(By.xpath("((//div[@class=\"_2kHMtA\"])[1]//span)[6]"));
		System.out.println(ratings.getText());
		Thread.sleep(2000);
		driver.close();
		
	}

}
