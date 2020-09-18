package Practice.Appium_Framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import Practice.Appium_Framework.Capability;
import Practice.Appium_Framework.SelectLang_Main;

public class SelectLang_Test extends Capability{
	

SelectLang_Main selLang;
	
@Test
public void selLang() throws InterruptedException {
	
	Thread.sleep(5000);
	selLang = new SelectLang_Main(driver);
	Thread.sleep(5000);
	selLang.SelLang();
	}

}
