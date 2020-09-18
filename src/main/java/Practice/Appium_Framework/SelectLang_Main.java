package Practice.Appium_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


	
	public class SelectLang_Main {
		AndroidDriver<AndroidElement> driver;
		public SelectLang_Main(AndroidDriver<AndroidElement> driver) {
			this.driver =  driver;
		}
	
	public void SelLang() throws InterruptedException {
		
		//Scroll to Select Language
		
		/*WebElement selLangbtn = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Select language\"));");
		Thread.sleep(5000);
		selLangbtn.click();
		System.out.println("Clicked on Select Language");*/
		
		//Click on settings button
		WebElement settingsBtn = driver.findElement(MobileBy.AccessibilityId("Settings"));
		settingsBtn.click();
		Thread.sleep(5000);
		
		//Click on Language and region
		WebElement selLangReg = driver.findElementByAndroidUIAutomator("text(\"Language & region\")");
		selLangReg.click();
		
		//Click on English
		WebElement lang = driver.findElementByAndroidUIAutomator("text(\"English\")");
		lang.click();
		System.out.println("Clicked on English");
		
		//Select the English language
		WebElement selLang = driver.findElementByAndroidUIAutomator("text(\"English\")");
		String expecLang = driver.findElementByAndroidUIAutomator("text(\"English\")").getText();
		selLang.click();
		
		Thread.sleep(10000);
		
		//Go back one page
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		Thread.sleep(8000);
		
		//Click on settings button again
		WebElement settBtn = driver.findElement(MobileBy.AccessibilityId("Settings"));
		settBtn.click();
		Thread.sleep(5000);
				
		//Click on Language and region again
		WebElement selLanReg = driver.findElementByAndroidUIAutomator("text(\"Language & region\")");	
		selLanReg.click();
		
		
		//Verify the language
		String actLang = driver.findElementByAndroidUIAutomator("text(\"English\")").getText();
		System.out.println(actLang);
		//Check if the selected language is correct
		Assert.assertEquals(actLang, expecLang);
		
		//Go back to  page
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	}

}
