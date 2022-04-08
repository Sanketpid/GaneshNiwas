package popuphandle;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childarraylist {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
    driver.get("https://skpatro.github.io/demo/links/");
    Thread.sleep(2000);
    driver.manage().window().maximize();
    Thread.sleep(2000);
//    WebElement New_Window = driver.findElement(By.name("NewWindow"));
//    New_Window.click();
    WebElement New_Tab = driver.findElement(By.name("NewWindow"));
    New_Tab.click();
    Set<String> Windowsids = driver.getWindowHandles();
    //System.out.println(Windowsids);
//   Iterator<String> it = Windowsid.iterator();
//   String mainpage = it.next();
//   String child = it.next();
    ArrayList<String> al= new ArrayList<>(Windowsids);
    String mainpage = al.get(0);
  String childpage = al.get(1);
   driver.switchTo().window(childpage);
   driver.manage().window().maximize();
   Thread.sleep(2000);
   WebElement childtext = driver.findElement(By.id("the7-search"));
   Thread.sleep(2000);
   childtext.sendKeys("MIYA LOG");
   Thread.sleep(2000);
   driver.close();
   driver.switchTo().window(mainpage);
   WebElement mainhomebutton = driver.findElement(By.name("home"));
   mainhomebutton.click();
   driver.quit();
   
}
}
