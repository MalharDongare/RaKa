package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class LoginPageTest extends BaseTest{
	@Test (priority=1)
	public void LoginPageTitleTest() {
		String actTitle = loginPage.getTitleLoginPage();
		Assert.assertEquals(actTitle, "Account Login");
		
	}
	@Test (priority=2)
	public void loginPageURLTest() {
		String actURL=loginPage.getLoginPAgeUrl();
		Assert.assertTrue(actURL.contains("route=account/login"));
	}
	@Test (priority=3)
	public void forgotPwdLinkExistTest() {
		Assert.assertTrue(loginPage.isForgetPWdLinkExist());
		
	}
	@Test (priority=4)
	public void loginTest() {
		String accPageTitle=loginPage.doLogin("malhar@gmail.com", "Test@12345");
		Assert.assertEquals(accPageTitle, "My Account");
	}

}
