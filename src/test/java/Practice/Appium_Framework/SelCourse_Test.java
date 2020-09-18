package Practice.Appium_Framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Practice.Appium_Framework.SelectCourse_Main;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import Practice.Appium_Framework.Capability;


public class SelCourse_Test extends Capability{
	
	SelectCourse_Main selCourse;
		
	@Test
	public void courseSel() throws InterruptedException, IOException {
		
		//Thread.sleep(10000);
		selCourse = new SelectCourse_Main(driver);
		Thread.sleep(5000);
		selCourse.EditBtnClick();
		selCourse.SelCourse();
		selCourse.OpenCourse();
		//selCoursePage.selCourse();
		//selCoursePage.launchCourseinChrome();
	}
	
	

}
