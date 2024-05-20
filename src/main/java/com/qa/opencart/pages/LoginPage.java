package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	//private By Locators
	private By emailId=By.id("input-email");
	private By password = By.id("input-password");
	private By loginButton=By.xpath("//input[@value='Login']");
	private By forgetpwdlink = By.linkText("Forgotten Password");
	//public page class constants
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
//public [age Actions/Methods
	public String getTitleLoginPage()
	{
		String title=driver.getTitle();
		System.out.println("Login page title is:"+title);
		return title;
	}
	public String getLoginPAgeUrl() {
		String url=driver.getCurrentUrl();
		System.out.println("Login page url is:"+url);
		return url;
		
	}
	public boolean isForgetPWdLinkExist() {
		return driver.findElement(forgetpwdlink).isDisplayed();
	}
	public String doLogin(String username,String Password) {
		System.out.println("usercreds:"+ username +":"+ password);
		driver.findElement(emailId).sendKeys(username);
		driver.findElement(password).sendKeys(Password);
		driver.findElement(loginButton).click();
		return driver.getTitle();
	}
}
