package com.sgtesting.seleniumpraticepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class4 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		CloseBrowser();
		
	}
	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();//webdriver.chrome.driver
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
			oBrowser.get("https://www.facebook.com/");
			Thread.sleep(8000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void CloseBrowser()
	{
		try
		{
			oBrowser.close();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
