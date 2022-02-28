package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilites.Helper;

public class TestBase extends AbstractTestNGCucumberTests
{

	public WebDriver driver ;

	@BeforeSuite
	public void startup()
	{
		String path = System.getProperty("user.dir")+ "/driver/chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver", path) ;

		driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.nopcommerce.com/");
	}


	

	// take  screenshots after method fail 
	@AfterMethod
	public void screenshotsfailure ( ITestResult result )
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println("Test case is failure ");
			Helper.takeScreen(driver, result.getName());
		}

	}
	
	/*
	@AfterSuite
	public void stop ()
	{
		driver.close();	
	}
    */


}
