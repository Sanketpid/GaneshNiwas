package vctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_dropdownfb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\11th dec\\chromedriver_win32//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement Signup = driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]"));
        Signup.click();
        Thread.sleep(1000);
        
        WebElement DayDropdown = driver.findElement(By.id("day"));
       Select s1= new Select(DayDropdown);
        for(int i=0;i<=28;i++) {
      s1.selectByIndex(i);
       Thread.sleep(100);
       }
        
        WebElement MonthDropdown = driver.findElement(By.id("month"));
        Select s2= new Select(MonthDropdown);
        for(int j=0;j<=11;j++) {
        s2.selectByIndex(j);
        Thread.sleep(2000);
        }
        Thread.sleep(2000);
        WebElement YearDropdown = driver.findElement(By.xpath("//select[@id='year']"));
        Select s3= new Select(YearDropdown);
      for(int k=0;k<=27;k++) {
        s3.selectByIndex(k);
        
        Thread.sleep(200);
       }
	}}
