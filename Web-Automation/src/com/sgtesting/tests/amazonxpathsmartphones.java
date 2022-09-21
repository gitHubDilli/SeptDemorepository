package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonxpathsmartphones {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		displaysmartphones();
		
		
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
			oBrowser.get("https://www.amazon.in/");
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void displaysmartphones()
	{
		try
		{
			List<WebElement> oSmartphones=oBrowser.findElements(By.name("smart"));
			for(int i=0;i<oSmartphones.size();i++)
			{
				String numberofphones=oSmartphones.get(i).getText();
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
