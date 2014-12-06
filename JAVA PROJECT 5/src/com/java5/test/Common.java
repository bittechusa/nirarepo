package com.java5.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common
{
	FirefoxDriver x;
	public Common(FirefoxDriver h)
	{
		x=h;
	}
	public void m1(By m,String i)
	{
		x.findElement(m).sendKeys(i);
		
	}
}
