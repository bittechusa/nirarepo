import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

//we don't need the word "test" after class name for this class because it does not have test annotation
public class CommonMethodTest {
	FirefoxDriver dr;
	//FirefoxDriver moga
	//	public CommonMethodTest(FirefoxDriver moga1)
	//moga=moga1

	public CommonMethodTest(FirefoxDriver moga)
    //(FirefoxDriver dr)
	//this.dr=dr
	{
		dr= moga;
	}

	public void verifyText(String textname)
	{
		if(dr.getPageSource().contains(textname))
		{
			System.out.println("text found");
			
		}
		else
		{
			System.out.println("text not found");
			
		}
	}// end of verifyText Method
	
	
	public void verifyTitle(String title)

	{
		if(dr.getTitle().contains(title))
		{
			System.out.println("title matched");
		}	
		else
		{
			System.out.println("title did not match");
		}
	}//end of verifyTitle Method
	
	public void type(By by, String value)
	{
	dr.findElement(by).sendKeys(value);
	}//end of type method
	
	public void click(By by)
	{
		dr.findElement(by).click();
	}// end of click method

	public void verifyElementPresent(By by)
	{
		if(dr.findElement(by).isDisplayed())
		{
			System.out.println("element present");
		}
		else
		{
			System.out.println("element is not present");
		}
	}//end of verifyElementPresent method
	
	public void loopOnNewImage() throws Throwable
	{
		int s=dr.findElementsByXPath("//div[@id='productGridContainer']/div").size();
		for(int i=1; i<=s;i++)
		{
			Thread.sleep(3000);
			dr.findElement(By.xpath("//div[@id='productGridContainer']/div["+i+"]")).click();
			Thread.sleep(3000);
			dr.navigate().back();
			Thread.sleep(3000);
		}
	}
}