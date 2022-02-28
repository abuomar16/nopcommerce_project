package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ReviewPage;
import pages.SearchPage;
import pages.UserLoginPage;

public class AddReviewTest extends TestBase{

	
	
	HomePage homeObject ;
	UserLoginPage loginObject ;
	SearchPage   searchObject ;
	ReviewPage reviewObjet ;
	
	@Test
	public void addReviewSucessfully() throws InterruptedException
	{
		
	homeObject = new HomePage (driver) ;
	homeObject.openLoginLink();
	
	loginObject = new UserLoginPage(driver) ;
	loginObject.userlogin("ma32@gmail.com", "123456");
	
	searchObject = new SearchPage(driver) ;
	searchObject.searchText("Apple mac ");	
	
	reviewObjet = new ReviewPage(driver) ;
	reviewObjet.addReview("good review" , "i love this product ");
	
	Assert.assertTrue(reviewObjet.sucessfully_masseage.getText().contains("Product review is successfully "));
	
	}

}
