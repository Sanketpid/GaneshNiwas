package vctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect_forloop {
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
	
	System.out.println("Can we select multiple options "+result);
	
for(int i=0;i<=3;i++) {
	s1.selectByIndex(i);
	Thread.sleep(2000);
}
for(int j=3;j>=0;j--)	{
	s1.deselectByIndex(j);
	Thread.sleep(2000);
}

Thread.sleep(5000);
driver.quit();
}
}
