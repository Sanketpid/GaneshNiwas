package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlistic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		Thread.sleep(2000);

List<WebElement> hea = driver.findElements(By.xpath("//table[@border='1']//tr[1]//th"));
String ts = driver.findElement(By.xpath("//table[@border='1']//tr[1]//th[1]")).getText();
System.out.print(ts+"||");
for(int k=1;k<=5;k++) {
String str = hea.get(k).getText();
System.out.print(str+"||");
}
System.out.println();
for(int i=1;i<=4;i++) {
	
	for(int j=1;j<=6;j++) {
		
		if(j==1){ 
			if(i==1) {
				String head = driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[4]/table/tbody/tr[1]/th")).getText();
			System.out.print(head+"||");
			}else {
			 String headers = driver.findElement(By.xpath("//table[@border='1']//tr["+i+"]//th["+j+"]")).getText();
			 System.out.print(headers+"||");}
			if(j==1&i==1) {
			 String data1 = driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[4]/table/tbody/tr[1]/td[1]")).getText();
			System.out.print(data1+"||");}
			else {
				String data2 = driver.findElement(By.xpath("//table[@border='1']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(data2+"||");}
			}
			
		
		else {
			 String data = driver.findElement(By.xpath("//table[@border='1']//tr["+i+"]//td["+j+"]")).getText();
			System.out.print(data+"||");
		}
		
	}
	System.out.println();
}
		
	Thread.sleep(5000);
driver.close();
}}