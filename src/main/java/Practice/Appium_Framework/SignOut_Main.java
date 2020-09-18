package Practice.Appium_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SignOut_Main {

	AndroidDriver<AndroidElement> driver;
	public SignOut_Main(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
}
	public void SignOut() throws InterruptedException {
		WebElement settingsBtn = driver.findElement(MobileBy.AccessibilityId("Settings"));
		settingsBtn.click();
		Thread.sleep(3000);

		WebElement signoutLink = driver.findElement(By.xpath("//*[@text='Sign out']"));
		signoutLink.click();
		Thread.sleep(2000);
	}
}
	