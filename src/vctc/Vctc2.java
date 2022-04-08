package vctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vctc2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
    driver.get("https://www.discoveryplus.in/");
    Thread.sleep(2000);
    driver.manage().window().maximize();
    Thread.sleep(2000);
    WebElement SignInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
    Thread.sleep(2000);
    SignInButton.click();
   Thread.sleep(1000);
   WebElement getOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
   //System.out.println(getOTP.isEnabled());
    boolean result = getOTP.isEnabled();
    if(result) {
    	System.out.println("Get OTP is "+result);
    }
    else {
    	driver.findElement(By.id("mobileNumber")).sendKeys("9923252522");
    	Thread.sleep(200);
    	getOTP.click();
    	System.out.println("get otp option is clicked");
    	
    }
    
}}

