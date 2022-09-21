package com.sgtesting.seleniumpraticepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxBrowser {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		OpenBrowser();
		closeBrowser();
		
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
			oBrowser.get("https://www.youtube.com/watch?v=5NQjLBuNL0I");
			Thread.sleep(7000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void closeBrowser()
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
