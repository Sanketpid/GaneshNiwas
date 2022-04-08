package vctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vctc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    Thread.sleep(1000);
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    WebElement webele= driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
	    String Actualtext = webele.getText();
	    String Expectedtext="Welcome To Practice Page";
	    if(Actualtext.equals(Expectedtext)) {
	    	System.out.println("text is matching test case is pass");
	    }
	    else {System.out.println("text is not matching test case failed");}
	}

}
