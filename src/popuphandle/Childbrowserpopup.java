package popuphandle;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://skpatro.github.io/demo/links/");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    WebElement New_Window = driver.findElement(By.name("NewWindow"));
	    New_Window.click();
	    Set<String> Allwindows = driver.getWindowHandles();
	    System.out.println(Allwindows);
	    Iterator<String> it = Allwindows.iterator();
	    String mainpage=it.next();
	    String child=it.next();
	    Thread.sleep(2000);
	    driver.switchTo().window(child);
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    WebElement childhome = driver.findElement(By.xpath("//span[text()='HOME']"));
	    childhome.click();
	    Thread.sleep(5000);
	    driver.close();
	    driver.switchTo().window(mainpage);
	    WebElement home_Button = driver.findElement(By.name("home"));
	    home_Button.click();
	    
	  
	
	}}
