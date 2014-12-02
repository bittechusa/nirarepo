package com.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser
{
	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver browser=new FirefoxDriver();
		browser.get("http://www.bluefly.com");
		System.out.println(browser.getTitle());
		browser.manage().window().maximize();
		if(browser.getTitle().equals("Bluefly - Designer Clothing, Handbags, Shoes & Accessories (Prada, Fendi, Gucci & more) at Discount Prices"
))
		{
			System.out.println("matched");
		}
		else
		{
			System.out.println("didnt matched");
		}
		Utility ul=new Utility(browser);//use the click method another way
		//ul.verifyElement(By.xpath(".//div[@id='homeContainer']/header/div[1]/div[1]/a"));
		WebElement newlink=browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[1]/a"));
		newlink.click();
		Thread.sleep(4000);
		WebElement women=browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[2]/a"));
		women.click();
		Thread.sleep(4000);
		WebElement shoes=browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[3]/a"));
		shoes.click();
		Thread.sleep(4000);
		WebElement handbags=browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[4]/a"));
		handbags.click();
		Thread.sleep(4000);
		WebElement jewlery=browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[5]/a"));
		jewlery.click();
		Thread.sleep(4000);
		WebElement beauty=browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[6]/a"));
		beauty.click();
		Thread.sleep(5000);
		WebElement men=browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[7]/a"));
		men.click();
		Thread.sleep(5000);
		WebElement kids=browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[8]/a"));
		kids.click();
		Thread.sleep(5000);
		WebElement home=browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[9]/a"));
		home.click();
		Thread.sleep(5000);
		WebElement gift =browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[10]/a"));
		gift.click();
		Thread.sleep(5000);
		WebElement designers=browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[11]/a"));
		designers.click();
		Thread.sleep(5000);
		browser.quit();
		
		
		
	
		
		
		
		
		/*browser.get("http://www.facebook.com");
		browser.manage().window().maximize();
		System.out.println(browser.getTitle());
		Utility u=new Utility(browser);
		u.verifyTitle("pageTitle", "Facebook");
		u.type(By.id("u_0_1"), "farzana");
		u.type(By.id("u_0_3"), "nira");
		u.type(By.id("u_0_5"), "farzana.tuktuki@yahoo.com");
		u.type(By.id("u_0_8"), "farzana.tuktuki@yahoo.com");
		u.type(By.id("u_0_a"), "12345");
		u.type(By.id("month"), "may");
		u.type(By.id("day"), "9");
		u.type(By.id("year"), "1988");
		u.click(By.id("u_0_g"));
		u.click(By.id("u_0_i"));
		u.click(By.id("email"));
		u.click(By.id("pass"));
		u.click(By.id("u_0_n"));
		u.verifyText(".//*[@id='blueBarNAXAnchor']/div/div/div/a/i");
		*/
		
	}
	
}
