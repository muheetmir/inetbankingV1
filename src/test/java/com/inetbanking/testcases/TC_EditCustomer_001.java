package com.inetbanking.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.EditCustomer;
import com.inetbanking.pageObjects.LoginPage;

public class TC_EditCustomer_001 extends BaseClass {

	
	
	
	@Test
	public void editCustomerLink() throws Exception
	{
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		EditCustomer ed=new EditCustomer(driver);
		ed.editCustomerLink();
		String id=ed.customerId("123456");
		ed.reset();
		
		captureScreen(driver, "editCustomerLink");
		
		
	
	
	}
}
