package Practice.Appium_Framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Practice.Appium_Framework.SignIn_Main;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import Practice.Appium_Framework.Capability;

public class SignIn_Test extends Capability{
	
	SignIn_Main signIn;
	
	
	@Test
	public void openApp() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = DesiredCapability();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		signIn = new SignIn_Main(driver);
		signIn.clickDismiss1();
		signIn.clickDismiss2();
	}
	
	@Test(dependsOnMethods = "openApp")
	public void signIn() throws InterruptedException {
		signIn.sign_In();
	}
}


