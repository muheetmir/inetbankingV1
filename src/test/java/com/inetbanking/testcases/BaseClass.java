package com.inetbanking.testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {

	
	ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public WebDriver driver;
	public static Logger logger;
	
		@Parameters("browser")
		@BeforeClass
		public void setUp(String br)
{
			
		if(br.equals("chrome"))	{
	System.setProperty("webdriver.chrome.driver",readconfig.getCromePath());
	driver=new ChromeDriver();
		}
		
		else if(br.equals("firefox")){
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver=new FirefoxDriver();
			}
		
		
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIePath());
			driver=new InternetExplorerDriver();
		}
		
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		
	logger=Logger.getLogger("inetBanking");
	PropertyConfigurator.configure("log4j.properties");

}

		@AfterClass
		public void tearDown()
		{
			driver.quit();
		}


}
