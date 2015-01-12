import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;




public class DropDownSize
{

	@Test
	public void m1() throws InterruptedException
	{
		FirefoxDriver dr= new FirefoxDriver();
		dr.get("http:www.facebook.com");
		FluentWait w = new FluentWait(dr);
		w.withTimeout(10, TimeUnit.SECONDS);
		w.pollingEvery(5, TimeUnit.SECONDS);
		w.ignoring(Exception.class); // no such element exception should be written here instead of only exception..!
		//w.until((Predicate) dr.findElement(By.xpath(".//*[@id='u_0_i']")));
		//w.ignoring(Exception.class);
		dr.findElement(By.xpath(".//*[@id='u_0_p']")).click();
		/*dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// implicit wait
		dr.findElement(By.id("u_0_3"));// email box
		WebDriverWait cd= (WebDriverWait) new WebDriverWait(dr, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("u_0_3")));// Explicit wait
		System.out.println(cd);// explicit wait
		cd.until(ExpectedConditions.elementToBeClickable(By.id("u_0_n")));//explicit wait
		dr.findElement(By.id("u_0_n"));*/
		
		
		
		// HOW TO GET ALL TEXT LINKS IN AN WEBSITE.

		/*List <WebElement> txt= dr.findElements(By.tagName("a"));// get all texlink
		int t= txt.size();
		System.out.println(t);
		for(WebElement count:txt) // enhanced loop
		{
			System.out.println(count.getText());
		}
		
		
		
	}*/
}
}
