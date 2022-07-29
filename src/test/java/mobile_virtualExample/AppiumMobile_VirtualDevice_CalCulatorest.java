package mobile_virtualExample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumMobile_VirtualDevice_CalCulatorest {
	
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
		
		
		driver = new AppiumDriver<MobileElement>(new URL(appium_server), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		System.out.println("test case execution in progress.......");
		
		
		
	}
	
	
	

}
