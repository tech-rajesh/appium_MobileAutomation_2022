package mobile_virtaulDeviceRecap;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest_virtualDevices {
	
	AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void setup() throws Exception {
		
		
		String appium_server = "http://192.168.1.5:4723/wd/hub";		
		//Devices
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");			//API -30
		
		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		
		//Application -
		//appPackage and appActivity
		//Method1 ---  apk Info
		//
		
		
		//method 2
		//adb shell sumpsys window
//		adb shell dumpsys window | find "mCurrentFocus"
//		  mCurrentFocus=Window{b2564d5 u0 com.google.android.calculator/com.android.calculator2.Calculator}
		
		
		cap.setCapability("appPackage", "com.google.android.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		//cap.setCapability(MobileCapabilityType.APP, "path of application.apk");
		
		//Driver instance
		driver = new AppiumDriver<MobileElement>(new URL(appium_server), cap);
		//driver = new AppiumDriver<MobileElement>(new URL("http://192.168.1.5:4723/wd/hub"), cap);
		
		
		
		
	}
	

}
