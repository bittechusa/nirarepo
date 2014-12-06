package com.java5.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Moga 
{
 FirefoxDriver x;
 public void click(By m4)
 {
	x.findElement(m4).click();
 }
	
	public Moga(FirefoxDriver z)
	{
		x=z;
	}
	
}
