package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//absoultxpath();
		//relativeXPathUsingTagName();
		relativeXPathUsingindexTagName();
		
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///C:/CoachingFiles/SELENIUM_HMTL/Sample.html");
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void absoultxpath()
	{
		/**
		 * Case 1: Using tagName to identify the Element
		 * Syntax: //<tagName>
		 */
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'uid1user1name1\']")).sendKeys("userdemo1");
	
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void relativeXPathUsingTagName()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser1");
	}
	private static void relativeXPathUsingindexTagName()
	{
		oBrowser.findElement(By.xpath("//input[7]")).sendKeys("DemoUser1");
	}
	

}
