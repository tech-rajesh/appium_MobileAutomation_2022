package mobile_virtualExample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumMobile_VirtualDevice_LaunchCalCulator_AddTest extends BaseTest_Virtual{
	
	
	
	@Test
	public void verifyAddTest() throws Exception {
		
		
		
		//press 9 using ID - com.google.android.calculator:id/digit_9
		
		MobileElement button_nine = driver.findElement(By.id("com.google.android.calculator:id/digit_9"));
		
		System.out.println("Get Class value: " + button_nine.getAttribute("class"));
		System.out.println("Get text value: " + button_nine.getAttribute("text"));
		//System.out.println("Get index value: " + button_nine.getAttribute("index"));
//		System.out.println("Get package value: " + button_nine.getAttribute("package"));
//		System.out.println("Get content-desc value: " + button_nine.getAttribute("content-desc"));
//		System.out.println("is button clickable or not:  " + button_nine.getAttribute("clickable"));
		Thread.sleep(3000);
		button_nine.click();
		button_nine.click();
		button_nine.click();
		button_nine.click();
		Thread.sleep(3000);
	}
	
	
	

}
