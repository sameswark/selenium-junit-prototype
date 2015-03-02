package com.sam.seleniumjunit.test;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings({ "deprecation", "unused" })
public class GoogleTestCase {

	WebDriver driver ;
	
	@Before
	public void setUp(){
		 driver = new FirefoxDriver();
			
	
	}
	@Test
	public void Test001(){
		
		
		driver.get("http://google.com");
		System.out.println(driver.getCurrentUrl());
		
	}
	
	@After
	public void TearDown(){
		
		driver.quit();
		
	}
	
}
