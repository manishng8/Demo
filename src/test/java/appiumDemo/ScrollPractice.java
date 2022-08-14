package appiumDemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ScrollPractice {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver;

		DesiredCapabilities caps = new DesiredCapabilities();
		String url = "http://localhost:4723/wd/hub";
		
		caps.setCapability("udid", "RZ8M22J5C2P");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");	
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-G973F");
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.baa.heathrow");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.baa.heathrow.splash.SplashActivity");
		
		
		driver = new AndroidDriver<AndroidElement>(new URL(url), caps);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//*[@resource-id=\"com.baa.heathrow:id/btnTodayFlight\"]")).click();	
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Vienna (VIE)\"));");
		driver.quit();
			
	}

}
