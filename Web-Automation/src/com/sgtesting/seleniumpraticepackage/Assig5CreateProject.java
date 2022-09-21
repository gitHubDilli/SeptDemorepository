package com.sgtesting.seleniumpraticepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig5CreateProject {
	public static WebDriver obrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		CreateCustomer();
		CreateProject();
		deleteproject();
		logout();
		closeBrowser();
		
		
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
			obrowser.get("http://localhost:8081/login.do");
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void CreateCustomer()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]")).click();
			
			obrowser.findElement(By.xpath("//div [text()='Add New']")).click();
			Thread.sleep(2000);

			obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);

			obrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("customer61");
			Thread.sleep(2000);
			obrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("example description");
			Thread.sleep(2000);

			obrowser.findElement(By.xpath("//span [text()='Create Customer']")).click();
			Thread.sleep(2000);

		
		}catch(Exception e)
		{
			e.printStackTrace();

		}
   }
	private static void CreateProject()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("project 1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		
		{
			e.printStackTrace();
		}
	
	}
	private static void deleteproject()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeBrowser()
	{
		try
		{
			obrowser.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}	
