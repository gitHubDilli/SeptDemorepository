package com.sgtesting.xpathcreating;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	//webElement for user name test Field
	private WebElement username;
	public WebElement getusername()
	{
		return username;
		
	}
	private WebElement pwd;
	public WebElement getpassword()
	{
		return pwd;
		
	}
	@FindBy(xpath="//div [text()='Login ']")
	private WebElement Login;
	public WebElement getlogin()
	{
		return Login;
		
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyoverwindow()
	{
		return gettingStartedShortcutsPanelId;
		
	}
	
	private WebElement logoutLink;//logout
	public WebElement getLogout()
	{
		return logoutLink;
		
	}
	@FindBy (xpath="// div [text ()='USERS']")
	private WebElement usercreate;
	public WebElement getusercreate()
	{
		return usercreate;
		
	}
	@FindBy (xpath="// div [text()='Add User']")
	private WebElement adduser;
	public WebElement getadduser()
	{
		return adduser;
		
	}
	private WebElement userDataLightBox_firstNameField;
	public WebElement getuserfirstnname()
	{
		return userDataLightBox_firstNameField;
		
	}
	private WebElement firstName;
	public WebElement getuser1stname()
	{
		return firstName;
		
	}
	private WebElement lastName;
	public WebElement getuserlastName()
	{
		return lastName;
		
	}
	private WebElement userDataLightBox_emailField;
	public WebElement getusermail()
	{
		return userDataLightBox_emailField;
			
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement getlogindetailsusn()
	{
		return userDataLightBox_usernameField;
		
	}
	private WebElement password;
	public WebElement getlogindetailspwd()
	{
		return password;
		
	}
	private WebElement passwordCopy;
	public WebElement getlogindetailsrepwd()
	{
		return passwordCopy;
		
	}
	@FindBy(xpath="//span [text ()='Create User']")
	private WebElement CreateUse;
	public WebElement getcreateuserclick()
	{
		return CreateUse;
		
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement changeusename;
	public WebElement clickonexistinguser()
	{
		return changeusename;
	}
	@FindBy(xpath="// span [text()='Save Changes']")
	private WebElement savechanges;
	public WebElement clicksavechangesbutton()
	{
		return savechanges;
		
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement deleteuser;
	public WebElement selectdeletemodifieduser()
	{
		return deleteuser;
		
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement deletedmodifieduser()
	{
		return userDataLightBox_deleteBtn;
		
	}
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[1]")
	private WebElement taskbar;
	public WebElement clicktask()
	{
		return taskbar;
		
	}
	@FindBy(xpath="// div [text ()='Add New']")
	private WebElement newcustomer;
	public WebElement clickaddnewcustomer()
	{
		return newcustomer;
		
	}
	@FindBy(xpath="// div [text ()='+ New Customer']")
	private WebElement addnewtask;
	public WebElement clicknewTask()
	{
		return addnewtask;
		
	}
}
