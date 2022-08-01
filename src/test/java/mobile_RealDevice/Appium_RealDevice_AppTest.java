package mobile_RealDevice;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Appium_RealDevice_AppTest extends BaseTest_RealDevices_InstallApp{
	
	@Test
	public void verifyApptest() {
		
		
//		MobileElement ele = driver.findElementsByClassName("android.widget.TextView").get(2);	
//		System.out.println("***********: "+ele.getText());
//	
//		ele.click();
//		//perform action on specif elemement
		

		List<MobileElement>  ele_mutiple = driver.findElementsByClassName("android.widget.TextView");
		
		System.out.println("Element count: " + ele_mutiple.size());

		
		for(int i=0; i< ele_mutiple.size(); i++) {
			
			String value = ele_mutiple.get(i).getText();
			
			if(value.equalsIgnoreCase("Preference")) {
				System.out.println(ele_mutiple.get(i).getText());
				ele_mutiple.get(i).click();
				break;
			}
			
		}
		
		
		
		
		
	}
	
	

}
