package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ChartPage;
import pages.CheckOutPage;
import pages.HomePage;
import pages.SearchPage;
import pages.UserRegisterationPage;

public class CheckOutTest extends TestBase {

	HomePage homeObject ;
	UserRegisterationPage registerObject ;
	SearchPage searchObject ;
	ChartPage chartObject ;
	CheckOutPage checkObject ;
	
	
	@Test
	public void addTochareSucessfully() throws InterruptedException 
	{
		homeObject  =   new HomePage  (driver) ;
		registerObject =   new  UserRegisterationPage (driver) ;
		searchObject = new  SearchPage(driver) ;
		chartObject = new  ChartPage(driver) ;
		checkObject = new  CheckOutPage(driver) ;
		/////////////
		homeObject.openRegisterLink();
		registerObject.userRegisteration("mohamed", "ahmed", "ma36@gmail.com", "com", "123456") ;
		searchObject.searchText("Apple mac ");
		chartObject.addToCart();
		chartObject.CheckOUT();
		checkObject.check("cairo", "El Qanatir", "02", "01150439940") ;
		
		Assert.assertTrue(checkObject.successfly_massage.getText().contains("order has been successfully"));
		
	}
	
}
