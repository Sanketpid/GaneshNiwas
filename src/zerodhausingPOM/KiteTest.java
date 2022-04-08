package zerodhausingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTest {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			
			Thread.sleep(1000);
			
			KiteloginpagePOM login= new KiteloginpagePOM(driver);
			login.sendUserID();
			login.sendPassword();
			login.clickLoginButton();
			
			Thread.sleep(1000);
			KitepinpagePOM pin= new KitepinpagePOM(driver);
			pin.sendPin();
			pin.ClickContinueButton();
			Thread.sleep(1000);
			KiteHomepagePOM home= new KiteHomepagePOM(driver);
			home.validateUserID();
			home.clickLogoutButton();

	}

}
