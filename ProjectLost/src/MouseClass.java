import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MouseClass 
{

       FirefoxDriver dr= new FirefoxDriver();
	
	@Test
	public void click() throws InterruptedException
	{
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("http://www.facebook.com");
		dr.manage().window().maximize();
		Actions ac= new Actions(dr);
		WebElement signUp= dr.findElement(By.id("u_0_i"));
		WebElement home=dr.findElement(By.xpath(".//*[@id='blueBarNAXAnchor']/div/div/div/div[1]/h1/a/i"));
		//WebDriverWait wt= (WebDriverWait) new WebDriverWait(dr,3).until(ExpectedConditions.elementToBeClickable(By.id("u_0_i")));
		//ac.moveToElement(signUp).build().perform();
		Thread.sleep(3000);
		//ac.contextClick().sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ENTER).build().perform();
		//ac.contextClick(signUp).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		//ac.moveToElement(signUp).sendKeys(Keys.ENTER).build().perform();
		//ac.moveToElement(home).perform();
		ac.moveToElement(home).contextClick().sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		home.click();
		//signUp.click();
		Thread.sleep(1000);
		dr.kill();
	}
	
	

@Test
public void dragAndDrop() throws InterruptedException
{	
	dr.get("http://jqueryui.com/droppable/");
	dr.manage().window().maximize();
	dr.switchTo().frame(0);
	WebElement drag= dr.findElement(By.xpath(".//*[@id='draggable']"));
	WebElement drop = dr.findElement(By.xpath(".//*[@id='droppable']"));
	Actions ac= new Actions(dr);	
	ac.dragAndDropBy(drag, 200, 10).build().perform();;
	Thread.sleep(2000);
	ac.dragAndDrop(drag, drop).build().perform();
	Thread.sleep(2000);
	dr.kill();
}
}