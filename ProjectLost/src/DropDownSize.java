import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class DropDownSize
{

	@Test
	public void m1() throws InterruptedException
	{
		FirefoxDriver dr=new FirefoxDriver();
		/*FirefoxDriver dr= new FirefoxDriver();
		dr.get("http:www.facebook.com");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// implicit wait
		dr.findElement(By.id("u_0_3"));// email box
		WebDriverWait cd= (WebDriverWait) new WebDriverWait(dr, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("u_0_3")));// Explicit wait
		System.out.println(cd);// explicit wait
		cd.until(ExpectedConditions.elementToBeClickable(By.id("u_0_n")));//explicit wait
		dr.findElement(By.id("u_0_n"));
		
		*/
		
		// HOW TO GET ALL TEXT LINKS IN AN WEBSITE.

		List <WebElement> txt= dr.findElements(By.tagName("a"));// get all texlink
		int t= txt.size();
		System.out.println(t);
		for(WebElement count:txt) // enhanced loop
		{
			System.out.println(count.getText());
		}
		
		
		
	}
}
