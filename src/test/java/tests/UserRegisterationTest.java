package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegisterationPage;
import pages.UserLoginPage;

public class UserRegisterationTest  extends TestBase {

	HomePage homeOBbject ; 
	
	UserRegisterationPage registerObject ;
	
	UserLoginPage loginobject ;

	@Test(priority=1)
	public void registerSucessfuly ()
	{
		homeOBbject = new HomePage(driver) ;
		homeOBbject.openRegisterLink();
		
		registerObject =new UserRegisterationPage(driver) ;
		registerObject.userRegisteration("mohamed", "ahmed", "ma01@gmail.com", "com", "123456");
		Assert.assertTrue(registerObject.successfly_massage.getText().contains("completed"));
		
	}
	
	@Test(priority=2)
	public void logoutSucessfuly()
	{
		homeOBbject.userlogout();
		
	}
	@Test(priority=3)
	public void loginSucessfuly()
	{
		loginobject =new UserLoginPage(driver) ;
		homeOBbject.openLoginLink() ;
		
		loginobject.userlogin("ma01@gmail.com", "123456");
		
	}
	
}


