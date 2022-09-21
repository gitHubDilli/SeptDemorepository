package com.sgtesting.seleniumpraticepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogicdownloadAutomated {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser() ;
		navigateBrowser();
		planname();

	}
	private static void LaunchBrowser() 
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
	private static void navigateBrowser()
	{
		try
		{
			oBrowser.get("https://brighthealthplan.com/individual-and-family/drug-search");
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void planname()
	{
	
	try
	{
		//oBrowser.findElement(By.id("href=\"https://cdn1.brighthealthplan.com/docs/formulary/2022-al-ifp-formulary-en.pdf")).click();
		oBrowser.findElement(By.className("gtm_cta_link gtm_cta_download")).click();
		Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
  }
	
}	
