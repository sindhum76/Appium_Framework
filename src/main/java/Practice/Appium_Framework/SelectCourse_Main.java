package Practice.Appium_Framework;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SelectCourse_Main {
	
	AndroidDriver<AndroidElement> driver;
	public SelectCourse_Main(AndroidDriver<AndroidElement> driver) {
		this.driver =  driver;
	}
	
	public void EditBtnClick() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(8000);
		WebElement getst = driver.findElementByAndroidUIAutomator("text(\"Edit\")");
		getst.click();
		System.out.println("after clikcing on edit");
		Thread.sleep(10000);
	}
	
	public void SelCourse() throws InterruptedException {
		
		
		WebElement doneBtn = driver.findElement(By.className("android.widget.Button"));
		doneBtn.click();
		Thread.sleep(2000);
		
		//Scroll to Graduate Studies and tap on it
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Graduate studies\"));");
		WebElement gradeName = driver.findElement(By.xpath("//*[@text='Graduate studies']"));
		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(gradeName))).perform();
		Thread.sleep(2000);
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		
		//Select the course
		String actual = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Computer programming\"));").getText();
		String expected = "Computer programming";
		
		//Check if the course selected is correct
		
		Assert.assertEquals(actual, expected);

	}
	
	public void OpenCourse() throws InterruptedException {
		
		//Click on the course
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Computer programming\"));");
		WebElement compProg = driver.findElement(By.xpath("//*[@text='Computer programming']"));
		compProg.click();
		Thread.sleep(5000);
			
		//Check if the option is for "Open with Chrome"
		
		String checkoption = driver.findElement(By.id("android:id/title")).getText();
		System.out.println(checkoption);
		
		//If option is "Open With Chrome" click on "Just Once" button
		if(checkoption.equalsIgnoreCase("Open with Chrome"))
		{
			WebElement JustOnceBtn =  driver.findElement(By.id("android:id/button_once"));
			JustOnceBtn.click();
			Thread.sleep(40000);
			
			//Check the context if browser is opened
			Set<String> contextNames = driver.getContextHandles();
			for(String contextName: contextNames) {
				System.out.println(contextName); 
				
			}
			
			driver.context("WEBVIEW_chrome");
		}
	}
	
	
	
	/*public void OpenCourseinBrowser() throws InterruptedException {
		
		//Click on the course
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Computer programming\"));");
		WebElement compProg = driver.findElement(By.xpath("//*[@text='Computer programming']"));
		compProg.click();
		Thread.sleep(3000);
		
		int openWithOption1 = driver.findElements(By.id("android:id/text1")).size();
		
		for(int i=0;i<openWithOption1;i++)
		{
			WebElement openWithOptions = driver.findElements(By.id("android:id/text1")).get(i);
			String chromeTxt = openWithOptions.getText();
			if(chromeTxt.contains("Chrome")) {
				openWithOptions.click();
				Thread.sleep(1000);
			}
		}
			
		WebElement justOnceBtn = driver.findElement(By.id("android:id/button_once"));
		justOnceBtn.click();
		Thread.sleep(10000);
		
		int openWithOption2 = driver.findElements(By.id("android:id/text1")).size();
		
		for(int i=0;i<openWithOption2;i++)
		{
			WebElement openWithOptions = driver.findElements(By.id("android:id/text1")).get(i);
			String chromeTxt = openWithOptions.getText();
			if(chromeTxt.contains("Chrome")) {
				openWithOptions.click();
				Thread.sleep(1000);
			}
		}
		
		justOnceBtn.click();
		Thread.sleep(20000);
		
		Set<String> contextNames = driver.getContextHandles();
		for(String contextName: contextNames) {
			System.out.println(contextName); 
		}
		
		//driver.context("WEBVIEW_chrome");
	}*/
}
