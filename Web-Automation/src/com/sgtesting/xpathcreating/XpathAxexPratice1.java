package com.sgtesting.xpathcreating;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxexPratice1 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchbrowser();
		Navigateurl();
		entersalaryforsachinetendulkar();
	}
	private static void launchbrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Navigateurl()
	{
		try
		{
			oBrowser.get("file:/C:/CoachingFiles/SELENIUM_HMTL/WebTableHTML.html");
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case 1: following-sibling
	 * Enter the salary for the Person Sachin Tendulkar
	 */
	private static void entersalaryforsachinetendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[1]/td[6]/input")).sendKeys("20000");
								        //td [text()='Rahul Dravid']/following::tr[1]/td[6]/input
	}
	

}
