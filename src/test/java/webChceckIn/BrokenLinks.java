package webChceckIn;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mnagle\\Documents\\manishng8\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> ls = driver.findElements(By.tagName("a"));
		System.out.println(ls.size());
		for(WebElement we : ls)
		{
			if(!String.valueOf(we.getAttribute("href")).isBlank())
			{
				String url = we.getAttribute("href");
				
				HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();
				int responseCode = conn.getResponseCode();
				System.out.println(responseCode);
				if(responseCode>=400)
				{
					System.out.println("The Link with Text"+ we.getText()+" is broken with response code"+responseCode );
					Assert.assertTrue(false);
				}
			}
		}
	}

}
