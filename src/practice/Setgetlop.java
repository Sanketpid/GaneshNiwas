package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setgetlop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.youtube.com/");
    Thread.sleep(200);
    Dimension d= new Dimension(1000,500);
    driver.manage().window().setSize(d);
    for(int i=10;i<=800;i=i+10) {
    	
    	driver.manage().window().setPosition(new Point(i, 10));
    	Thread.sleep(200);
    }
for(int i=800;i>=0;i=i-10) {
    	
    	driver.manage().window().setPosition(new Point(i,500));
    	Thread.sleep(200);
    }
driver.get("chrome://settings/clearBrowserData");
Thread.sleep(1000);

Thread.sleep(1000);
WebElement cookie_clear_button = driver.findElement(By.xpath("//*[@id=\"clearBrowsingDataDialog\"]/div[1]/div"));

System.out.println(cookie_clear_button.getText());
Thread.sleep(1000);
}
}
