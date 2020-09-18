package Practice.Appium_Framework;

import Practice.Appium_Framework.PlayVideo_Main;

import java.io.IOException;

import org.testng.annotations.Test;

import Practice.Appium_Framework.Capability;

public class PlayVideo_Test extends Capability{
	
	PlayVideo_Main playVideo;
	
	@Test
	public void playVid() throws InterruptedException, IOException {
		
		//Thread.sleep(10000);
		playVideo = new PlayVideo_Main(driver);
		Thread.sleep(5000);
		playVideo.playVideo();
	}
	
	

}
