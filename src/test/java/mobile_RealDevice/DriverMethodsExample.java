package mobile_RealDevice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DriverMethodsExample extends BaseTest_RealDevices_InstallApp_AndroidSpecific{

	
	@AfterMethod
	public void afterMethodTes() {
		System.out.println("====================================================");
		
	}
	
	@Test
	public void verifyBatteryDetails() {
		
		
		System.out.println("Get Battery details of Real device");
		System.out.println("Battery level: " +driver.getBatteryInfo().getLevel());
		System.out.println("Battery state: " +driver.getBatteryInfo().getState());
		
		
	}
	
	
	@Test
	public void verifyOrientation() {
		
		
		System.out.println("Get Orientation details of Real device");
		System.out.println("Orientation: " +driver.getOrientation());
		
		
		
	}
	
	
	@Test
	public void verifygetContext() {
		
		
		System.out.println("Get getContext details of Real device");
		System.out.println("getContext: " +driver.getContext());
		
		
		
	}
	
	@Test
	public void verifyCurrentPackage() {
		
		
		System.out.println("Get CurrentPackage details of Real device");
		System.out.println("CurrentPackage: " +driver.getCurrentPackage());
		
		
		
	}
	
	
	@Test
	public void verifyLocation() {
		
		
		System.out.println("Get Location details of Real device");
		System.out.println("Altitude: " +driver.location().getAltitude());
		System.out.println("Latitude: " +driver.location().getLatitude());
		System.out.println("Longitude: " +driver.location().getLongitude());
		
	}
	
	@Test
	public void verifyDeviceLocked() {
		
		System.out.println("Get DeviceLocked details of Real device");
		System.out.println("Is device locked or not: " +driver.isDeviceLocked());
		
	}
	
	@Test(priority = 2)
	public void verifyDeviceLockedoNot() throws Exception {
		
		Thread.sleep(4000);
		driver.lockDevice();
		System.out.println("Get DeviceLocked details of Real device");
		System.out.println("Is device locked or not: " +driver.isDeviceLocked());
		Thread.sleep(4000);
	}
	
	
}
