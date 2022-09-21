package com.sgtesting.seleniumpraticepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowserpract2 {
	public static WebDriver oBrowser=null;
	
	public static void main(String[] args) {
		lanchbrowser();
	}
	public static void lanchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe ");
			oBrowser=new ChromeDriver();//webdriver.chrome.driver
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
	}

}
