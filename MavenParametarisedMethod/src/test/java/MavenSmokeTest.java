import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MavenSmokeTest extends MavenBaseTest {
	@Test
	public void run() throws Throwable
	{
CommonMethodTest ct=new CommonMethodTest((FirefoxDriver) dr);
ct.verifyTitle("Bluefly");
ct.verifyText("bluefly");
Thread.sleep(3000);
ct.verifyElementPresent(By.xpath(".//*[@id='homeContainer']/header/div[1]/div[1]/a"));
Thread.sleep(3000);

ct.type(By.xpath(".//*[@id='searchterms']"), "clothes");	
Thread.sleep(3000);

	ct.click(By.xpath(".//*[@id='main-nav-new']/a"));
    Thread.sleep(3000);
    ct.loopOnNewImage();
    
	}

}
