package com.sgtesting.seleniumpraticepackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUserAssig2 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		OpenBrowser();
		LaunchBrowser();
		Login();
		MinFLyoverWindow();
		CreateUser();
		modifyUser();
		deleteuser();
		closeBrowser();
	}
	private static void OpenBrowser() 
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
	private static void LaunchBrowser()
	{
		try
		{
			oBrowser.get("http://localhost:8081/login.do");
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void MinFLyoverWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CreateUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(200);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo1");
			oBrowser.findElement(By.name("lastName")).sendKeys("user1");
			Thread.sleep(200);
			oBrowser.findElement(By.name("email")).sendKeys("demo2@123");
			oBrowser.findElement(By.name("username")).sendKeys("demouser1");
			oBrowser.findElement(By.name("password")).sendKeys("password1");
			Thread.sleep(200);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("password1");
			oBrowser.findElement(By.xpath("//span [text()='Create User']")).click();
			Thread.sleep(200);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span [text()='user1, Demo1']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demoufn");
			oBrowser.findElement(By.name("lastName")).sendKeys("demoln");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("mfuser");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span [text()='Save Changes']")).click();
			Thread.sleep(1000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(6000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeBrowser()
	{
		try
		{
			oBrowser.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
