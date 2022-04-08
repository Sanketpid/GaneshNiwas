package popuphandle;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopuph {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Windows.html");
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//button[text()='    click   ']")).click();
	Set<String> allwindowIds = driver.getWindowHandles();
	Iterator<String> it = allwindowIds.iterator();
	String mainpageid = it.next();//5196540F61FA3B18FAE7F6B5BEFA85B3
	String newtabid = it.next();

	driver.switchTo().window(newtabid);

	WebElement TextUkraine = driver.findElement(By.xpath("//h1[text()='Selenium Supports Ukraine']"));
	String Actualltext = TextUkraine.getText();
	String Expectedtext="Selenium Supports Ukraine";
	if(Actualltext.equals(Expectedtext))
	{
		System.out.println("Text matched ,Testcase is passed");
	}else {System.out.println("Text doesnt matched,Testcase is failed");}

	driver.close();
	driver.switchTo().window(mainpageid);

	WebElement seperateWindow = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	seperateWindow.click();


	WebElement childBrowser = driver.findElement(By.xpath("//button[@onclick='newwindow()']"));
	//childBrowser.click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",childBrowser);//alternate ways for click method .
	Set<String> Browserids = driver.getWindowHandles();
	Iterator<String> iter = Browserids.iterator();
	String mbrowser = iter.next();//875D55FC2667802D69E69A48384ABCDB
	String cbrowser = iter.next();

	driver.switchTo().window(cbrowser);
	WebElement Searchbox = driver.findElement(By.xpath("//input[@placeholder=' Search this site…']"));
	Searchbox.sendKeys("jai bheeem");
	driver.close();
	driver.switchTo().window(mbrowser);

	WebElement MultiBrowser = driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']"));
	MultiBrowser.click();

	WebElement multiCBrowser = driver.findElement(By.xpath("//button[@onclick='multiwindow()']"));
	multiCBrowser.click();

	Set<String> multiWindowIds = driver.getWindowHandles();
	Iterator<String> itr = multiWindowIds.iterator();
	String MP = itr.next();
	String CB1 = itr.next();
	String CB2 = itr.next();
	System.out.println(MP);//8A696320362E194B4C4DD1792F0E0677
	System.out.println(CB1);//BFA9E6869BE6425747D036514D81527F
	System.out.println(CB2);//2D8F91862A786458A29F53EB43BFDF85

	driver.switchTo().window(CB1);
	driver.findElement(By.xpath("//input[@placeholder=' Search this site…']")).sendKeys("once again jai bheem");
	driver.close();
	driver.switchTo().window(CB2);
	driver.findElement(By.id("email")).sendKeys("jai maharashtra");
	driver.close();
	driver.switchTo().window(MP);

	driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();

	driver.findElement(By.xpath("//a[text()='Alerts']")).click();
	WebElement iframe = driver.findElement(By.xpath("//div[@id='card']"));
	driver.switchTo().frame(iframe);Thread.sleep(1000);
	WebElement DismissButton = driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/span"));
	DismissButton.submit();
	driver.switchTo().window(MP);
}
}
