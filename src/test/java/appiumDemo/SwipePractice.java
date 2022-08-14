package appiumDemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class SwipePractice {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
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
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//*[@resource-id=\"com.baa.heathrow:id/btnTodayFlight\"]")).click();
		WebElement second = (WebElement)driver.findElement(By.xpath("//*[@text=\"Berlin (BER)\"]"));
		WebElement first = (WebElement)driver.findElement(By.xpath("(//*[@resource-id='com.baa.heathrow:id/btnAddFlight'])[4]"));
	    
	    TouchAction t = new TouchAction(driver);
        // Get the size of screen.
        Dimension size = driver.manage().window().getSize();
        System.out.println(size);

        // Find swipe x points from screen's with and height.
        // Find x1 point which is at right side of screen.
        int x1 = (int) (size.width * 0.20);
        // Find x2 point which is at left side of screen.
        int x2 = (int) (size.width * 0.80);
	    
	    
	    t.longPress(ElementOption.element(first)).moveTo(ElementOption.element(second, x1, 580)).release().perform();
	}

}
