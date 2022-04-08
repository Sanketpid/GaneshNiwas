package findelementsme;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vctctables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@id='product']//th"));
		
		for(WebElement w:tableHeader)
		{
			System.out.print(w.getText()+" ||");
		}
	
		//System.out.println();
		
		for(int i=2;i<=11;i++) {//3
			System.out.println();
			List<WebElement> tableRow = driver.findElements(By.xpath("(//table[@id='product']//tr)["+i+"]//td"));
			for(WebElement w:tableRow)
			{
				System.out.print(w.getText()+" ||");//3
			}
	}

}
}