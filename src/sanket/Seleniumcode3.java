package sanket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumcode3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
		WebDriver obj =new ChromeDriver();
		obj.get("https://www.netflix.com/in/");
		String s1 = obj.getTitle();
		System.out.println("The title of webpage is "+s1);
        String s2 = obj.getCurrentUrl();
        System.out.println("The url of current web base appplication is is "+s2);
        Thread.sleep(5000);
        obj.manage().window().minimize();
	}

}
