package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.MyAccountPage;
import pages.UserLoginPage;

public class UserChangePasswordTest  extends TestBase {
	
	HomePage homeOBbject ;
	UserLoginPage loginobject ;
	MyAccountPage changePassObject ;

	@Test
	public void changePassSuccessfuly()
	{
		homeOBbject = new HomePage(driver) ;
		homeOBbject.openLoginLink() ;
		
		loginobject = new UserLoginPage(driver)  ;
		loginobject.userlogin("ma01@gmail.com", "123456");
		
		changePassObject = new MyAccountPage(driver)  ;
		changePassObject.changePassword("123456", "102030");
		Assert.assertTrue(changePassObject.successfly_massage.getText().contains("Password was changed"));
	}
	
}
