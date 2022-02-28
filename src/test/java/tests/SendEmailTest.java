package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EmailFriendPage;
import pages.HomePage;
import pages.SearchPage;
import pages.UserLoginPage;

public class SendEmailTest extends TestBase {
	
	HomePage homeObject ;
	UserLoginPage loginObject ;
	SearchPage   searchObject ;
	EmailFriendPage emailObject ;
	
	@Test
	public void sendEmilSucssefuly() throws InterruptedException
	
	{
		homeObject = new HomePage (driver) ;
		homeObject.openLoginLink();
		
		loginObject = new UserLoginPage(driver) ;
		loginObject.userlogin("ma20@gmail.com", "123456");
		
		searchObject = new SearchPage(driver) ;
		searchObject.searchText("Apple");	
		
		emailObject = new EmailFriendPage(driver) ;
		emailObject.sendEmail("ma2@gmail.com", "i love you mooooooo");
		
		Assert.assertTrue(emailObject.sucessfully_masseage.getText().contains("Your message has been sent"));
	}
	
	
	

}
