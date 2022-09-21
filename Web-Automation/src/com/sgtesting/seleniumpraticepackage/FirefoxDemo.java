package com.sgtesting.seleniumpraticepackage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxDemo {
	public static  WebDriver oBrowser=null;

	public static void main(String[] args) {
		LaunchBrowser();
		//OpenBrowser();
		//CloseBrowser();
	}
	public static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void OpenBrowser()
	{
		try
		{
			oBrowser.get("http://127.0.0.1/testlink/login.php");
			Thread.sleep(5000);
			
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
