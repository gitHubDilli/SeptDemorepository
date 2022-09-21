package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class specificLinkpratice2 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchbrowser();
		navigate();
	//	displayliks();
	//	numberofLinks();
		clickonspecificLink();
		
		
	}
	private static void launchbrowser()
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
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void displayliks()
	{
		try
		{
			List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<oLinks.size();i++)
			{
				String Linksnames=oLinks.get(i).getText();
				System.out.println(Linksnames);
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void numberofLinks()
	{
		try
		{
			List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("Number of Links: "+oLinks.size());
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void clickonspecificLink()
	{
		List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<oLinks.size();i++)
		{
			String LinkNames=oLinks.get(i).getText();
			if(LinkNames.endsWith("Testing"));
			oLinks.get(i).click();
			break;
			
		}
	}
	

}
