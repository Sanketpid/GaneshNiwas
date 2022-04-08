package zerodhausingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomepagePOM {
       
	//initialize variables---->>> webelements
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
	@FindBy(xpath="//a[@target='_self']") private WebElement LogoutButton;
	
	//constructor use
	public KiteHomepagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//methods which works on data members
	public void validateUserID() {
		String actualText = userID.getText();
		String ExpectedText = "IJ4051";
		if(actualText.equals(ExpectedText)) {
			System.out.println("Text matches Test case is passed");
		}
	}
	public void clickLogoutButton() throws InterruptedException {
		userID.click();
		Thread.sleep(1000);
		LogoutButton.click();
	}
}
