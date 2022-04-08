package zerodhausingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteloginpagePOM {

	
		@FindBy(id="userid") private WebElement UserID;
		@FindBy(id="password") private WebElement password;
		@FindBy(xpath ="//button[@type='submit']") private WebElement LoginButton;
		
		KiteloginpagePOM(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void sendUserID(){
			UserID.sendKeys("IJ4051");
			}
		public void sendPassword() {
			password.sendKeys("Sanket@123");
		}
		public void clickLoginButton() {
			LoginButton.click();
		}

	}


