package com.inetbanking.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_Login_001 extends BaseClass {

	
	@Test
	public void loginTest()
	{
		
		LoginPage lp=new LoginPage(driver);
		logger.info("URL Opened");
		lp.setUserName(username);
		logger.info("Enter User name");
		lp.setPassword(password);
		logger.info("Enter password");
		lp.clickSubmit();
		
		if(driver.getTitle().equalsIgnoreCase("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		/*lp.logout();*/
	}
	
	
}
