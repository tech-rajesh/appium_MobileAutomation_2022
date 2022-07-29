package mobile_virtualExample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumMobile_VirtualDevice_LaunchCalCulatorTest {
	
	AppiumDriver<MobileElement> driver;
	
	@Test
	public void launchCalTest() throws Exception {
		
		
		String appium_server = "http://192.168.1.5:4723/wd/hub";
		//emulator-5554
		//devices
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		//cap.setCapability("platformVersion", "11.0");
		
		
		//application
		//appPackage & appActivity
		
		//Method1 - using APK info application
		//com.android.calculator2.Calculator
		
		
		//Method2 - using adb shell
//		adb shell dumpsys window | find "mCurrentFocus"
//		  mCurrentFocus=Window{e2c2a19 u0 com.google.android.calculator/com.android.calculator2.Calculator}
		
		
		
		cap.setCapability("appPackage", "com.google.android.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		driver = new AppiumDriver<MobileElement>(new URL(appium_server), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		System.out.println("test case execution in progress.......");
		
		
		
	}
	
	
	

}
