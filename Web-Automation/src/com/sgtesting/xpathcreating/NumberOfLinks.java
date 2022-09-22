package com.sgtesting.xpathcreating;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfLinks {
	public static WebDriver obrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//numberofLinksinpage();
		//DisplayAllLinks();
		//clickspecificlink();
		directopen();
		
		//close();
		
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
			obrowser.get("file:///C:/CoachingFiles/SELENIUM_HMTL/Sample.html");
			//obrowser.get("https://brighthealthcare.com/");
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void numberofLinksinpage()
	{
		try
		{
			List<WebElement> oLinks=obrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("# of Links in Web Page: "+oLinks.size());
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void DisplayAllLinks()
	{
		try
		{
			List<WebElement>oLinks=obrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<oLinks.size();i++)
			{
				String Linkname=oLinks.get(i).getText();
				System.out.println(Linkname);
			}
							
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void clickspecificlink()
	{
		try
		{
			List<WebElement> oLinks=obrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<oLinks.size();i++)
			{
				String Linknames=oLinks.get(i).getText();
				if (Linknames.endsWith("HQ"))
				{
					oLinks.get(i).click();
					break;
				}
				
			}
			Thread.sleep(3000);
			obrowser.navigate().back();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void directopen()
	{
		obrowser.findElement(By.xpath("/html/body/a[3]")).click();
	}
	
	
}
