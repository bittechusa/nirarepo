package com.java5.test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Java10 

{
	int d=100;
	String k="hello";
	Integer hq=1000;
	
	
	public static void main(String[] args)
	{
		Java8 ob=new Java8();
		ob.w("nira").text();
		ob.w("tuktuki").type();
		ob.w("true/false").change();
		String wo=new String("");
		wo.equals("hi");
		if(wo.equals("hi"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
			
		}
		
		
		FirefoxDriver browser=new FirefoxDriver();
		browser.get("http://www.bluefly.com");
		System.out.println(browser.getTitle());
		boolean title=browser.getTitle().contains("moga");
		System.out.println(title);
		if(title)
		{
			System.out.println("Title matched");
		}
		else
		{
			System.out.println("Title did not matched");
		}
		boolean title1=browser.getTitle().contains("");
		System.out.println(title1);
		if(title1)
		{
			System.out.println("Title matched");
		}
		else
		{
			System.out.println("Title did not matched");
		}
		
		if(browser.getTitle().equals("Bluefly - Designer Clothing, Handbags, Shoes & Accessories (Prada, Fendi, Gucci & more) at Discount Prices"
))
{
	System.out.println(true);
}
		else
		{
			System.out.println(false);
		}
		
		
		
	}

}
