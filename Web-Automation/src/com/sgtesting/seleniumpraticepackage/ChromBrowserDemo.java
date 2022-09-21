package com.sgtesting.seleniumpraticepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromBrowserDemo {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		ChromoBrowserlaunch();
		navigateBrowser();
		closeBrowser();
	}
	public static void ChromoBrowserlaunch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe ");
			oBrowser=new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigateBrowser()
	{
		try
		{
			oBrowser.get("http://sgtestinginstitute.com/index.php");
			Thread.sleep(4000);
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
