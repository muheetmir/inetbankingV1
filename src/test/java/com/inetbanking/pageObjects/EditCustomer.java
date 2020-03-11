package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EditCustomer {
	
	
	WebDriver driver;
	
	public EditCustomer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath="//a[text()='Edit Customer']")
	WebElement EditCustomerlink;
	
	@FindBy(name="cusid")
	WebElement CustId;
	
	@FindBy(xpath="//input[@value='Reset']")
	WebElement reset;
	
	
	
	public void editCustomerLink()
	{
		EditCustomerlink.click();
	}
	
	public String customerId(String Custid)
	{
		
		CustId.sendKeys(Custid);
		return Custid;
	}
	
	public void reset()
	{
		
		reset.click();
	String text=driver.findElement(By.xpath("//input[@value='Reset']")).getText();
	
	if(text.equalsIgnoreCase(""))
	
		Assert.assertTrue(true);
	else
		Assert.assertTrue(false);
		//System.out.println("Test failed");
	
	}
	

}
