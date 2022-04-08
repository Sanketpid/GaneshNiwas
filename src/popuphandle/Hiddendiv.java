package popuphandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendiv {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(200);
        driver.manage().window().maximize();
        Thread.sleep(200);
        WebElement canclepopup = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
        canclepopup.click();
        Thread.sleep(2000);
        WebElement mobilebutton = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[1]/div/img"));
        mobilebutton.click();
	}

}
