package mobile_RealDevice;

import org.testng.annotations.Test;

public class RealDevice_AutomateDemoApp extends BaseTest_RealDevices_InstallApp_AndroidSpecific{
	
	
	
	
	@Test
	public void test1() throws Exception {
		
		Thread.sleep(4000);
		//Click on Text
		driver.findElementByAccessibilityId("Text").click();
		
		Thread.sleep(4000);
		//Click on Text
		driver.findElementByAccessibilityId("LogTextBox").click();
		
		Thread.sleep(4000);
		//Click on Text
		driver.findElementByClassName("android.widget.Button").click();   //click on Add button
		
		Thread.sleep(4000);
		//Click on Text
		driver.findElementById("text").sendKeys("Appium learning code....");
		
	}

}
