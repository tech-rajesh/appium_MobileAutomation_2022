package mobile_virtualExample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumMobile_VirtualDevice_LaunchAlarmClockTest {
	
	AppiumDriver<MobileElement> driver;
	
	@Test
	public void launchCalTest() throws Exception {
		
		
		String appium_server = "http://192.168.1.5:4723/wd/hub";
		//emulator-5554
		//devices
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("udid", "emulator-5554");
		//cap.setCapability("platformName", "Android");
		
		
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		
		//cap.setCapability("platformVersion", "11.0");
		
		
		//application
		//appPackage & appActivity
		
		//Method1 - using APK info application
		//com.android.calculator2.Calculator
		
		
		//Method2 - using adb shell
//		adb shell dumpsys window | find "mCurrentFocus"
		
		//Calculator
//		  mCurrentFocus=Window{e2c2a19 u0 com.google.android.calculator/com.android.calculator2.Calculator}
		//Alarm Clock
		//com.google.android.deskclock/com.android.deskclock.DeskClock
		
		
		cap.setCapability("appPackage", "com.google.android.deskclock");
		cap.setCapability("appActivity", "com.android.deskclock.DeskClock");
		
		
		driver = new AppiumDriver<MobileElement>(new URL(appium_server), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		System.out.println("test case execution in progress.......");
		
		
		
	}
	
	
	

}
