package vctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipleselectdropdown2 {
public static void main(String[] args) throws InterruptedException {

	
System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/select-menu");
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(2000);
WebElement Multipleselect = driver.findElement(By.id("cars"));
Select s1= new Select(Multipleselect);
boolean result = s1.isMultiple();
System.out.println("The multiplke select is "+result);
s1.selectByIndex(2);
Thread.sleep(1000);
s1.selectByVisibleText("Volvo");
Thread.sleep(1000);
s1.selectByValue("saab");
Thread.sleep(2000);
//deselects methods

s1.deselectAll();
Thread.sleep(2000);
driver.quit();








}
}
