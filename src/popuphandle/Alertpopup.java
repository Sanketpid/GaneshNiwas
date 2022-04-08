package popuphandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
    driver.get("https://demoqa.com/alerts");
    Thread.sleep(2000);
    WebElement confirmbutton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
    confirmbutton.click();
    Thread.sleep(1000);
    Alert alt = driver.switchTo().alert();
    System.out.println("pop_up massage is "+alt.getText());
    alt.accept();
    Thread.sleep(1000);
    WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
    alertButton.click();
    Alert alt2 = driver.switchTo().alert();
    System.out.println("pop_up massage is "+alt2.getText());
    
    
}
}
