package mobile_virtualExample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumMobile_VirtualDevice_LaunchCalCulator_AddTest2 extends BaseTest_Virtual{
	
	
	
	@Test
	public void verifyAddTest() throws Exception {
		
		
		MobileElement button_nine = driver.findElement(By.id("com.google.android.calculator:id/digit_9"));
		MobileElement button_eight = driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
		MobileElement button_seven = driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
		
		driver.findElement(By.id("digit_9")).click();			//9
		button_nine.click();									//9
		button_eight.click();									//8
		button_seven.click();									//7
		
		
		Thread.sleep(3000);
		//Operation - Add
		driver.findElement(By.id("op_add")).click();
		
		Thread.sleep(3000);
		//2nd number- 
		button_nine.click();									//9
		button_nine.click();									//9
		button_eight.click();									//8
		button_seven.click();									//7
		
		
		
		//validation step
		String actualResult = driver.findElement(By.id("result_preview")).getText();
		System.out.println("Addition result: " + actualResult);
		
		Thread.sleep(3000);
	}
	
	
	

}
