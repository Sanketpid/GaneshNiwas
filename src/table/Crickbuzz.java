package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crickbuzz {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-series/3202/icc-womens-world-cup-2022");
		Thread.sleep(2000);
		List<WebElement> RowCount = driver.findElements(By.xpath("//table[@class='table table-condensed cb-stats-table']//tr"));
		List<WebElement> Coloumncount = driver.findElements(By.xpath("//table[@class='table table-condensed cb-stats-table']//tr[1]//th"));
		int TotalRows = RowCount.size();
		System.out.println(TotalRows);
		int TotalColoumn = Coloumncount.size();
		System.out.println(TotalColoumn);
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1) {
					String Headers = driver.findElement(By.xpath("//table[@class='table table-condensed cb-stats-table']//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(Headers+"||");
				
				}
				else {
					String Rowdata = driver.findElement(By.xpath("//table[@class='table table-condensed cb-stats-table']//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(Rowdata+"||");
					
				}
				
				
				
			}
			System.out.println();
			
		}
		
	}

}
