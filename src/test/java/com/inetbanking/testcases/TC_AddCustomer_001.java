package com.inetbanking.testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomer_001 extends BaseClass {

	
	@Test
	public void addCustomerLink()
	{
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		AddCustomerPage ac=new AddCustomerPage(driver);
		
		ac.addCustomer();
		ac.custName("Test");
		ac.dob("02", "03", "1976");
		ac.addresss("Hyderabad23");
		ac.city("Hyd");
		ac.state("Telangana");
		String email=randomString()+"gmail.com";
		ac.email(email);
	/*	ac.submit();*/
	}
	
	
	
	public String randomString()
	{
		String gen=RandomStringUtils.randomAlphabetic(8);
		return (gen);
	}
	
}
