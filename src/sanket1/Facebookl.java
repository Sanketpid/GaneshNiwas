package sanket1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookl {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
	WebDriver chrome =new ChromeDriver();
    chrome.get("https://www.facebook.com/");
    
}
}
