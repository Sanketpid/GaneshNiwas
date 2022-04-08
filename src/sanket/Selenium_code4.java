package sanket;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_code4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Radio2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Velocity Pune");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='option2']")).click();
	}

}
