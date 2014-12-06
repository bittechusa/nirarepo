package com.java5.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Type
{
	public static void main(String[] args)
	{
		FirefoxDriver x=new FirefoxDriver();
		x.get("http://www.facebook.com");
		System.out.println(x.getTitle());
		Common k=new Common(x);
		Moga t = new Moga(x);
	}
}
			
		