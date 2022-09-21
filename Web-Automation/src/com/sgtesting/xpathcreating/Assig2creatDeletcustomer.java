package com.sgtesting.xpathcreating;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig2creatDeletcustomer {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minFlyoverwindow();
		createtcustomer();
		
	}
	private static void launchBrowser() 
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		oPage=new ActiTimePage(oBrowser);
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:8081/login.do");
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oPage.getusername().sendKeys("admin");
			oPage.getpassword().sendKeys("manager");
			oPage.getlogin().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minFlyoverwindow() 
	{
		try
		{
			oPage.getFlyoverwindow().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createtcustomer()
	{
		try
		{
			oPage.clicktask().click();
			Thread.sleep(2000);
			oPage.clickaddnewcustomer().click();
			Thread.sleep(2000);
			oPage.clicknewTask().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
