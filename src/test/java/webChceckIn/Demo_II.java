package webChceckIn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo_II {
	WebDriver  driver = null;
	
	
	@BeforeMethod
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mnagle\\Documents\\manishng8\\Selenium_Grid\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
	}
	
	
	@Test	
	public	void t1() {
		//Email And Password
		

		WebElement email = driver.findElement(By.id("email-input"));
		Assert.assertTrue(email.isDisplayed(),"Unable to find email input field");
		
		WebElement password = driver.findElement(By.id("password-input"));
		Assert.assertTrue(password.isDisplayed(),"Unable to find password input field");

	}
	
	@Test
	public	void t2() {
		//Credential Working
		
		WebElement email = driver.findElement(By.id("email-input"));	
		WebElement password = driver.findElement(By.id("password-input"));
		WebElement loginButton  = driver.findElement(By.id("login-button"));	
		
		email.sendKeys("login@codility.com");
		password.sendKeys("password");
		loginButton.click();
		
		
		String welcomeMessage = "Welcome to Codility";
		WebElement successMessageObserved  = driver.findElement(By.xpath("//div[@class=\"message success\"]"));
		String sucMessageObs = successMessageObserved.getText();
		
		Assert.assertEquals(sucMessageObs, welcomeMessage);
	
	
	
	}

	@Test
	public	void t3() {
		//Incorrect Credentials Not Working
		
		WebElement email = driver.findElement(By.id("email-input"));	
		WebElement password = driver.findElement(By.id("password-input"));
		WebElement loginButton  = driver.findElement(By.id("login-button"));	
		
		email.sendKeys("unknown@codility.com");
		password.sendKeys("password");
		loginButton.click();
		
		
		String failureMessage = "You shall not pass! Arr!";
		WebElement failureMessageObserved  = driver.findElement(By.xpath("//div[@class=\"message error\"]"));
		String failMessageObs = failureMessageObserved.getText();
		Assert.assertEquals(failMessageObs, failureMessage);
	
	}
	
	@Test	
	public void t4()
	{
		// Invalid Format Email
		
		WebElement email = driver.findElement(By.id("email-input"));	
		WebElement password = driver.findElement(By.id("password-input"));
		WebElement loginButton  = driver.findElement(By.id("login-button"));	
		
		email.sendKeys("unknown");
		password.sendKeys("password");
		loginButton.click();	
		
		String emailFormatErrorText = "Enter a valid email";
		WebElement emailFormatError  = driver.findElement(By.xpath("//div[@class=\"validation error\"]"));
		String emailFormatMessageObs = emailFormatError.getText();
		Assert.assertEquals(emailFormatMessageObs, emailFormatErrorText);
	
	}

	@Test
	public void t5()
	{
		// Empty Credentials
		
		WebElement loginButton  = driver.findElement(By.id("login-button"));	
		loginButton.click();	
		
		
		WebElement blankEailError  = driver.findElement(By.xpath("//div[@class=\"validation error\" and text() = \"Email is required\"]"));
		WebElement blankPasswordError  = driver.findElement(By.xpath("//div[@class=\"validation error\" and text() = \"Password is required\"]"));
		
		String emailBlankErrorText = "Email is required";
		String emailBlankErrorObs = blankEailError.getText();
		
		String passwordBlankErrorText = "Password is required";
		String passwordBlankErrorObs = blankPasswordError.getText();
		
		//Email Error Assertion
		Assert.assertEquals(emailBlankErrorObs, emailBlankErrorText);
		
		//Password Error Assertion
		Assert.assertEquals(passwordBlankErrorObs, passwordBlankErrorText);
		
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		
		Thread.sleep(1000);
		driver.close();
	}
	
}
