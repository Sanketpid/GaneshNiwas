package findelementsme;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Honda {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement SearchButton = driver.findElement(By.xpath("//input[@title='Search']"));
		SearchButton.sendKeys("honda");
		Thread.sleep(2000);
		List<WebElement> Autosuggetions = driver.findElements(By.xpath("//ul//li"));
		int num = Autosuggetions.size();
		System.out.println(num+" Suggetions are getting");
		for(WebElement w:Autosuggetions) {
			System.out.println(w.getText());
			if (w.getText().equals("honda amaze")) {
				w.click();
				break;
			}
		}
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
	    String s= RandomString.make(2);
	    File desiredpath= new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Software Testing\\Seleniumscreenshot\\sanket"+s+".png");
        FileHandler.copy(source, desiredpath);
        Thread.sleep(2000);
        WebElement Images = driver.findElement(By.linkText("Images"));
        Images.click();
        File source2 = ts.getScreenshotAs(OutputType.FILE);
        File desiredpath2= new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Software Testing\\Seleniumscreenshot\\sanket"+s+".png");
        FileHandler.copy(source2, desiredpath2);
	}

}
