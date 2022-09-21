package com.sgtesting.seleniumpraticepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo1 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigateurl();
		//getnumberofLinks();
		//displayNumberofLinks();
		clickonSpecificLink();
		//clickononelink();
		
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
	private static void navigateurl()
	{
		try
		{
			oBrowser.get("https://brighthealthcare.com/");
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void getnumberofLinks()
	{
		try
		{
			List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("number of links available in this site: "+oLinks.size());
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void displayNumberofLinks()
	{
		try
		{
			List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<oLinks.size();i++)
			{
				String Linksname=oLinks.get(i).getText();
				System.out.println(Linksname);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void clickonSpecificLink()
	{
		
		try
		{
			List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<oLinks.size();i++)
			{
				String allLinks=oLinks.get(i).getText();
				if(allLinks.endsWith("Group"))
				{
					oLinks.get(i).click();
					break;
				}
			}
			Thread.sleep(4000);
			oBrowser.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void clickononelink()
	{
		try
		{
			List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<oLinks.size();i++)
			{
				String Linknames=oLinks.get(i).getText();
				if(Linknames.startsWith("POI"))
				{
					oLinks.get(i).click();
					break;
				}
			}
			Thread.sleep(2000);
			oBrowser.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
