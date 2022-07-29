package mobile_RealDevice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Appium_RealDevice_LaunchCalTest extends BaseTest_RealDevices{
	
	@Test
	public void addTest() {
		
		System.out.println("test case executon in progress....");
		
		
		MobileElement button_nine = driver.findElement(By.id("digit_9"));
		button_nine.click();
		
		driver.findElement(By.id("digit_8")).click();
		
		
		//operation
		driver.findElement(By.id("op_add")).click();
		
		//2nd number
		driver.findElement(By.id("digit_1")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_7")).click();
		
		
		//fetching results
		
		String actualResult = driver.findElement(By.id("result")).getText();
		System.out.println("Results: " + actualResult);
		Assert.assertEquals(actualResult, "1,985");
	}
	
	

}
