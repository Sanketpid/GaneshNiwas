package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XXX {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://xhamster18.desi/");
    Thread.sleep(10000);
    driver.findElement(By.xpath("//button[@data-role='confirm']")).click();
    Thread.sleep(10000);
    driver.findElement(By.name("q")).sendKeys("dani daniels");
    Thread.sleep(10000);
    driver.findElement(By.xpath("//button[@class='search-submit']")).click();
}
}
