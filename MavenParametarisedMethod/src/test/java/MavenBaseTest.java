import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class MavenBaseTest 
{
	//FirefoxDriver dr=new FirefoxDriver();
	DesiredCapabilities cap = new DesiredCapabilities();
	WebDriver dr ; 
	
	@Before
	public void start() throws Exception
	{
		new RemoteWebDriver(new URL("http://25.148.16.65:4444/wd/hub"), cap.firefox()); 
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://www.bluefly.com");
	}
@After
public void end() throws Throwable
{
    Thread.sleep(3000);
	dr.quit();
	}
}
