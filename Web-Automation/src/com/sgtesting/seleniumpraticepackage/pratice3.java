package com.sgtesting.seleniumpraticepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratice3 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateBrowser();
		CloseBrowser();
	}
	public static void launchBrowser()
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
	public static void navigateBrowser()
	{
		try
		{
			oBrowser.get("https://www.facebook.com/");
			Thread.sleep(6000);
			
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
