package popuphandle;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public Alert(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    WebElement Button = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
        Button.click();
        Thread.sleep(2000);
        WebElement Button2 = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
        Button2.click();
        Thread.sleep(2000);
        //driver.switchTo().alert().accept();
        driver.switchTo().alert();
        
        
      
        
        
	}

}
