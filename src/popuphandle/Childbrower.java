package popuphandle;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrower {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
    driver.get("https://skpatro.github.io/demo/links/");
    Thread.sleep(2000);
    driver.manage().window().maximize();
    Thread.sleep(2000);
//    WebElement New_Window = driver.findElement(By.name("NewWindow"));
//    New_Window.click();
    WebElement New_Tab = driver.findElement(By.name("NewTab"));
    New_Tab.click();
    Set<String> Windowsid = driver.getWindowHandles();
    System.out.println(Windowsid);
   Iterator<String> it = Windowsid.iterator();
   String mainpage = it.next();
   String child = it.next();
   driver.switchTo().window(child);
   driver.manage().window().maximize();
   WebElement childtext = driver.findElement(By.xpath("//input[@id='the7-search']"));
   childtext.sendKeys("MIYA LOG");
   driver.close();
   driver.switchTo().window(mainpage);
   WebElement mainhomebutton = driver.findElement(By.name("home"));
   mainhomebutton.click();
   driver.quit();
   
   
}
}
