package com.sgtesting.xpathcreating;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1CreateUser {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minFlyoverwindow();
		createUser();
		adduser();
		userfirstname();
		modificationANDdeleteduser();
	}
	private static void launchBrowser() 
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
	private static void createUser()
	{
		try
		{
			oPage.getusercreate().click();
			Thread.sleep(2000);
			oPage.getusername();
			Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void adduser()
	{
		try
		{
			oPage.getadduser().click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void userfirstname()
	{
		try
		{
			oPage.getuser1stname().sendKeys("User1");
			oPage.getuserlastName().sendKeys("user lastname");
			oPage.getusermail().sendKeys("userdemomail@gmail.com");
			Thread.sleep(2000);
			oPage.getlogindetailsusn().sendKeys("demo user");
			oPage.getlogindetailspwd().sendKeys("pwd123");
			oPage.getlogindetailsrepwd().sendKeys("pwd123");
			Thread.sleep(2000);
			oPage.getcreateuserclick().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void modificationANDdeleteduser()
	{
		try
		{
			oPage.clickonexistinguser().click();
			Thread.sleep(2000);
			oPage.getuserfirstnname().sendKeys("modified user");
			Thread.sleep(2000);
			oPage.clicksavechangesbutton().click();
			Thread.sleep(2000);
			oPage.selectdeletemodifieduser().click();
			Thread.sleep(2000);
			oPage.deletedmodifieduser().click();
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(3000);		
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}
