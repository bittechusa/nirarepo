package com.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility
{
		FirefoxDriver browser;
		public Utility(FirefoxDriver h)
		{
			browser=h;
		}
		public void verifyTitle(String x,String y)
		{
			if(x.contains(y))
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}	
			
		}
		public void type(By id,String name)
		{
			browser.findElement(id).sendKeys(name);
		}
		public void click(By clic)
		{
			browser.findElement(clic).click();
		}
		public void verifyText(String find)
		{
			if(browser.getPageSource().contains(find))
			{
				System.out.println("found");
			}
			else
			{
				System.out.println("not found");
			}
		}
		public void click(WebElement wel)
		{
			wel.click();
		}
		public void verifyElement(By found)
		{
			if(browser.findElement(found).isDisplayed())
			{
				System.out.println("Element found");
			}
			else
			{
				System.out.println("Element not found");
			}
		}
}
		

