package Practice.Appium_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class PlayVideo_Main {
	
	AndroidDriver<AndroidElement> driver;
	public PlayVideo_Main(AndroidDriver<AndroidElement> driver) {
		this.driver =  driver;
	}
	
	public void playVideo() throws InterruptedException {
		WebElement course1 = driver.findElement(By.xpath("//h3[text()='Intro to JS: Drawing & Animation']"));
		course1.click();
		Thread.sleep(10000);
		
		WebElement course2 = driver.findElement(By.xpath("//span[text()='What is Programming?']"));
		course2.click();
		Thread.sleep(10000);
		
		//Go back to the app
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(5000);
		
		driver.context("NATIVE_APP");
	}
	
}
