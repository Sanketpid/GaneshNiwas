package zerodhausingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitepinpagePOM {
	//variable Declaration---->>>Webelement
@FindBy(id="pin") private WebElement pin;
@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
    //Constructor to initialize webelements 
public KitepinpagePOM(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
// methods to use webelements 
public void sendPin() {
	pin.sendKeys("992325");
}
public void ClickContinueButton() {
	ContinueButton.click();
}
}
