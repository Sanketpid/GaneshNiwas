package vctc;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbloops {
public static void main(String[] args) throws InterruptedException {
try (Scanner sc = new Scanner(System.in)) {
	System.out.println("Enter your firstname");
	String FIRSTNAME=sc.next();
	System.out.println("Enter your Lastname");
	String LASTNAME=sc.next();	
	System.out.println("Enter your Mobilenumber or emailaddress");
	String Mobilenumber_OR_Email=sc.next();
	System.out.println("Enter new passward");
	String PASSWORD=sc.next();
	System.out.println("Enter your date of birth ");
	int date=sc.nextInt();
	System.out.println("Enter your month of birth");
	int month=sc.nextInt();
	System.out.println("Enter your age");
	int age=sc.nextInt();
	System.out.println("Enter your Gender like Male or Female");
	String GENDER=sc.next();
		System.setProperty("webdriver.chrome.driver","C:\\11th dec\\chromedriver_win32//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement Signup = driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]"));
	    Signup.click();
	    Thread.sleep(1000);
	    WebElement firstname = driver.findElement(By.name("firstname"));
	    firstname.sendKeys(FIRSTNAME);
	    Thread.sleep(1000);
	    WebElement Lastname = driver.findElement(By.name("lastname"));
	    Lastname.sendKeys(LASTNAME);
	    WebElement EmailorMobile = driver.findElement(By.name("reg_email__"));
	    EmailorMobile.sendKeys(Mobilenumber_OR_Email);
	    Thread.sleep(1000);
	    WebElement EmailorMobile1 = driver.findElement(By.name("reg_email_confirmation__"));
	    EmailorMobile1.sendKeys(Mobilenumber_OR_Email);
	    Thread.sleep(200);
	    WebElement password = driver.findElement(By.name("reg_passwd__"));
	    password.sendKeys(PASSWORD);
	    Thread.sleep(1000);
	  if(GENDER.equalsIgnoreCase("male")) {
	    	WebElement Male = driver.findElement(By.xpath("//input[@value='2']"));
	    	Male.click();
	    }
	    else {
	    	WebElement Female = driver.findElement(By.xpath("//input[@value='1']"));
	    	Female.click();
	    }  
	    Thread.sleep(1000);
	    WebElement DayDropdown = driver.findElement(By.id("day"));
	   Select s1= new Select(DayDropdown);
	   WebElement MonthDropdown = driver.findElement(By.id("month"));
	   Select s2= new Select(MonthDropdown);
	   WebElement YearDropdown = driver.findElement(By.xpath("//select[@id='year']"));
	   Select s3= new Select(YearDropdown);
	   Thread.sleep(10000);
	    for(int i=0;i<=30;i++) {
	  if(i==(date-1)) {s1.selectByIndex(i);}
	  Thread.sleep(200);
	  if(i==(month-1)){s2.selectByIndex(i);}
	  Thread.sleep(200);
	  if(i==age) {s3.selectByIndex(i);
	   Thread.sleep(200);
	   }
	  
	
	Thread.sleep(10000); 
	WebElement SignupButton = driver.findElement(By.name("websubmit"));
	SignupButton.click();
	Thread.sleep(2000);
	//driver.close();
	}
}
}}
