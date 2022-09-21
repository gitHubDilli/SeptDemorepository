package com.sgtesting.seleniumpraticepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyApplicationPratice {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		openBrowser();
		navigate();
		Login();
		itemsaddtocardList();
		checkoutInformation();
		Logout();
		closeApplication();
	}
	public static void openBrowser()
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
	public static void navigate()
	{
		try
		{
			oBrowser.get("https://www.saucedemo.com/");
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void Login()
	{
		try
		{
			oBrowser.findElement(By.name("user-name")).sendKeys("standard_user");
			oBrowser.findElement(By.name("password")).sendKeys("secret_sauce");
			oBrowser.findElement(By.name("login-button")).click();
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void itemsaddtocardList()
	{
		try
		{
			
			oBrowser.findElement(By.xpath("//*[@id='item_2_title_link']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='shopping_cart_container']/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("checkout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void checkoutInformation()
	{
		try
		{
			oBrowser.findElement(By.id("first-name")).sendKeys("Dillibabu");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("last-name")).sendKeys("Tester");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("postal-code")).sendKeys("91540");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("continue")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("finish")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("back-to-products")).click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try
		{
			oBrowser.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("logout_sidebar_link")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
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
