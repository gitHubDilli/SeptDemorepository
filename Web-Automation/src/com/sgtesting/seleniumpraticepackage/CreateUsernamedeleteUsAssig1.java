package com.sgtesting.seleniumpraticepackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUsernamedeleteUsAssig1 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		OpenBrowser();
		LaunchBrowser();
		Login();
		MinFLyoverWindow();
		CreateUser();
		deleteuser1();
		alterthandling();
		
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
			
		}catch(Exception e)//9743678678
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
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("user");
			Thread.sleep(200);
			oBrowser.findElement(By.name("email")).sendKeys("demo1@123");
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
	private static void deleteuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='user, Demo']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void alterthandling()
	{
		try
		{
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			Thread.sleep(6000);
			oAlert.accept();
			//oAlert.dismiss();
			//oAlert.sendKeys("");
			//oAlert.getText();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
