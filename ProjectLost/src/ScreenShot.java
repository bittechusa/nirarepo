import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScreenShot 
{
    FirefoxDriver dr= new FirefoxDriver();
	@Test
	public void capture() throws Throwable
	{
		//dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("http://www.facebook.com");
		dr.manage().window().maximize();
		File f= dr.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("Macintosh HD ▸ Users ▸ mohammaduddin ▸ fb.png"), true);
		dr.kill();
	}
	
	@Test
	public void screenShot() throws IOException
	{
		FirefoxDriver dr= new FirefoxDriver();
		dr.get("http://www.wwe.com");
		File tc=((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(tc, new File("Macintosh HD ▸ Users ▸ mohammaduddin ▸ Desktop ▸ pin.png"), true);
		
	}
	
	
}
