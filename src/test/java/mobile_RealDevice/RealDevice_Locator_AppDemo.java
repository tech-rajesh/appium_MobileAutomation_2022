package mobile_RealDevice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RealDevice_Locator_AppDemo extends BaseTest_RealDevices_InstallApp_AndroidSpecific{
	
	
	
	@Test
	public void locatorExample() {
		
		//ID
		//Class
		//AccessibilityId
		//Xpath
		
		
		
		//AccessibilityId
		//Android - Content-desc ---------> AccessibilityId  ----- Preference
		//iOS - AccessibilityId ----Preference
		//AccessibilityId
//		System.out.println("Text: " + driver.findElementByAccessibilityId("Preference").getText());
//		driver.findElementByAccessibilityId("Preference").click();

		
		//XPATH
		// mobile - desktop 
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Preference']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='OS']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Content']")).click();
		
		
		//AndroidUIAutomator
		driver.findElementByAndroidUIAutomator("text(\"Content\")").click();
		
		
	}
	

}
