package com.sgtesting.xpathcreating;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjmodel {
	public static WebDriver obrowser=null; 

	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	displaylinks();
	//	numbrofLinks();
		clickonspecifclink();
		
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			obrowser.get("https://www.javatpoint.com/how-to-sort-an-array-in-java");
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void displaylinks()
	{
		try
		{
			List<WebElement> oLinks=obrowser.findElements(By.xpath("//a[@href]"));
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
	private static void numbrofLinks()
	{
		try
		{
			List<WebElement> oLinks=obrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("Number of links in ths url: "+oLinks.size());
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void clickonspecifclink()
	{
		try
		{
			List<WebElement> oLinks=obrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<oLinks.size();i++)
			{
				String allLinks=oLinks.get(i).getText();
				if(allLinks.startsWith("About"))
				{
					oLinks.get(i).click();
					break;
				}
			}
			Thread.sleep(4000);
			obrowser.navigate().back();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	



}
