package popuphandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childtab {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
    driver.get("https://skpatro.github.io/demo/links/");
    Thread.sleep(2000);
    driver.manage().window().maximize();
    Thread.sleep(2000);
    WebElement New_Tab = driver.findElement(By.name("NewTab"));
    New_Tab.click();
    Set<String> AllIds = driver.getWindowHandles();
    Iterator<String> it = AllIds.iterator();
    String mainpage = it.next();
    String newtab = it.next();
    driver.switchTo().window(newtab);
    Thread.sleep(10000);
    WebElement searchicon = driver.findElement(By.xpath("//a[@class='submit text-disable']"));
    searchicon.click();
    Thread.sleep(1000);
    WebElement sendtext = driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/header/div[2]/div/form/div[2]/input"));
    sendtext.sendKeys("Happy bday vijay sir");
    Thread.sleep(1000);
    //driver.close();
    driver.switchTo().window(mainpage);
    WebElement mainhome = driver.findElement(By.name("home"));
    mainhome.click();
    Thread.sleep(2000);
    driver.quit();
}
}
