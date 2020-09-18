package Practice.Appium_Framework;

import org.testng.annotations.Test;

import Practice.Appium_Framework.*;

public class SignOut_Test extends Capability{
	
	SignOut_Main sign_Out;
	
	@Test
	public void signOut() throws InterruptedException {
		
		sign_Out = new SignOut_Main(driver);
		sign_Out.SignOut();
		
		}

}
