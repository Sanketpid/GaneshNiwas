package findelementsme;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handletables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> tableheaders = driver.findElements(By.xpath("//table[@id=\"product\"]//tr//th"));
		for(WebElement w:tableheaders) {
			System.out.print(w.getText()+"|| ");
		}
		for(int i=2;i<=11;i++) {
			System.out.println();
            List<WebElement> rowdata = driver.findElements(By.xpath("(//table[@id='product']//tr)["+i+"]//td"));
        for(WebElement w:rowdata) {
	System.out.print(w.getText()+"|| ");
                                  }

	                           }
	}
}
