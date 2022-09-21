package com.sgtesting.seleniumpraticepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assig4modifycusto {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createCustomer();
		modifyCustomer();
		
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
	private static void navigate()
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
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			//Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			//Thread.sleep(4000);
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			//Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div [text()='Add New']")).click();
			//Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Customer Name Demo");
			//Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Demo customer description");
			//Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span [text()='Create Customer']")).click();
			Thread.sleep(2000);
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void modifyCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(4000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")).click();
			
			//oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")).isSelected();
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
