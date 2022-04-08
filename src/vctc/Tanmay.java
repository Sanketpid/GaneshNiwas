package vctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tanmay {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\11th dec\\chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");   Thread.sleep(500);
		
		driver.manage().window().maximize();     Thread.sleep(1000);
		
		WebElement textbox = driver.findElement(By.xpath("//span[text()='Text Box']"));
		textbox.click();Thread.sleep(1000);

		WebElement Fullname = driver.findElement(By.id("userName"));
		Fullname.sendKeys("tanmay sadhankar");Thread.sleep(1000);
		
		WebElement Email = driver.findElement(By.id("userEmail"));
		Email.sendKeys("tanmaysadhankar@gmail.com");Thread.sleep(1000);
		
		WebElement currentaddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		currentaddress.sendKeys("Besa ,nagpur");Thread.sleep(1000);
		
		WebElement permanentaddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		permanentaddress.sendKeys("Saubhagya nagar ,Besa ,nagpur");Thread.sleep(3000);
		
		WebElement submitbutton = driver.findElement(By.xpath("//button[text()='Submit']"));
		submitbutton.click();Thread.sleep(1000);
		
		WebElement header_checkbox = driver.findElement(By.xpath("//span[text()='Check Box']"));
		header_checkbox.click();Thread.sleep(1000);
		
		WebElement checkbox = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
		checkbox.click();Thread.sleep(500); Thread.sleep(1000);
		
		WebElement radiobutton = driver.findElement(By.xpath("//span[text()='Radio Button']"));
		radiobutton.click();Thread.sleep(1000);
		
		WebElement impressiveRadio = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
		impressiveRadio.click();Thread.sleep(1000);
		
		WebElement Webtables = driver.findElement(By.xpath("//span[text()='Web Tables']"));
		Webtables.click();Thread.sleep(4000);
		
		String[]name={"tanmay","amey","saket","hitesh","parshu"};
		String[]lastname={"sadhankar","nalawade","pidurkar","bhoyar","akshumani"};
		String[]email={"tanmay@gmail.com","amey@gmail.com","sanket@gmail.com","hitesh@gmail.com","parshu@gmail.com"};
		String[]age1={"25","28","26","27","24"};
		String[]salary1={"1000","2000","3000","4000","5000"};
		
		for(int j=0;j<=4;j++) {
		WebElement ADDbutton = driver.findElement(By.xpath("//button[text()='Add']"));
		
		ADDbutton.click();Thread.sleep(500);
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		
		WebElement age = driver.findElement(By.id("age"));
		
		WebElement salary = driver.findElement(By.id("salary"));
		
		WebElement department = driver.findElement(By.id("department"));
		
		WebElement submit = driver.findElement(By.id("submit"));

			firstname.sendKeys(name[j]);Thread.sleep(500);
			lastName.sendKeys(lastname[j]);Thread.sleep(500);
			userEmail.sendKeys(email[j]);Thread.sleep(500);
			age.sendKeys(age1[j]);Thread.sleep(500);
			salary.sendKeys(salary1[j]);Thread.sleep(500);
			department.sendKeys("testing");Thread.sleep(500);
			submit.click();
		}
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
