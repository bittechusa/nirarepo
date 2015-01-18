import java.io.File;



import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.HasInputDevices;
//import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

//import com.sun.jna.platform.FileUtils;


public class DemoKeyboard 
{
	FirefoxDriver dr;

	@Test
	public void keyboard()
	{
		//FirefoxDriver dr= new FirefoxDriver();
		dr.get("http://www.bluefly.com");
		Keyboard kb =((HasInputDevices)dr).getKeyboard();
		kb.sendKeys(Keys.COMMAND,Keys.SHIFT,"p");
		 String Default = dr.getWindowHandle();
		 Set<String> win=dr.getWindowHandles();
		for(String loop:win)
		{
			if(!loop.equals(Default))
			{
				dr.switchTo().window(loop);
				
			}
		}
		dr.get("http://www.facebook.com");
	
		
		
	}
	
	
	@Test
	public void m1()
	
	{
		dr= new FirefoxDriver();
		dr.get("http://www.google.com");
		Keyboard kb= dr.getKeyboard();
		kb.sendKeys(Keys.COMMAND,Keys.SHIFT,"p");
		String parentwindow= dr.getWindowHandle();
		Set <String> multiwindow= dr.getWindowHandles();
		for(String win: multiwindow)
		{
			if(!win.equals(parentwindow))
			{
				dr.switchTo().window(win);
			}
		}
		dr.get("http://www.facebook.com");
	}
}
