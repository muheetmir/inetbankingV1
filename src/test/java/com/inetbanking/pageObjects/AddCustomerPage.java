package com.inetbanking.pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCustomerPage {
	
	
	WebDriver driver;
	
	By addcustlink=By.xpath("//a[contains(text(),'New Customer')]");
	By Custname=By.name("name");
	By dob=By.xpath("//input[@name='dob' and @id='dob']");
	By address=By.name("addr");
	By city=By.name("city");
	By state=By.name("state");
	By pinnum=By.name("pinno");
	By emailid=By.name("emailid");
	/*By submit=By.xpath("//input[@name='sub']");*/
	
	public AddCustomerPage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	public void addCustomer()
	{
		driver.findElement(addcustlink).click();
	}
	
	public void custName(String user)
	{
		driver.findElement(Custname).sendKeys(user);
	}
	
	public void dob(String dd,String mm,String yyyy )
	{
		driver.findElement(dob).sendKeys(dd);
		driver.findElement(dob).sendKeys(mm);
		driver.findElement(dob).sendKeys(yyyy);
		
	}
	
	public void addresss(String add)
	{
		driver.findElement(address).sendKeys(add);
	}
	
	public void city(String city1)
	{
		driver.findElement(city).sendKeys(city1);
	}
	
	public void state(String st)
	{
		driver.findElement(state).sendKeys(st);
	}
	
	public void pinnumber(String pin)
	
	{
		driver.findElement(pinnum).sendKeys(pin);
	}
	
	public void email(String email)
	{
		driver.findElement(emailid).sendKeys(email);
	}
	
	/*public void submit()
	{

	driver.findElement(submit).click();
	}*/
	
}

