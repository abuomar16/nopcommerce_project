package tests;

import org.testng.annotations.Test;
import pages.ComparePage;
import pages.SearchPage;


public class compereProductTest extends TestBase {
	
	
	
	SearchPage searchObject ;
	ComparePage compereObject ;
	
	@Test
	public void compereSucessfully () throws InterruptedException
	{
	
		searchObject = new SearchPage(driver);
		compereObject = new ComparePage(driver) ;
		
		searchObject.searchText("apple mac");
		compereObject.AddProductToCompere();

		searchObject.searchText("Asus");
		compereObject.AddProductToCompere();
		
		//Assert.assertTrue(compereObject.sucessfully_masseage.getText().contains("The wishlist is empty!"));
			
	}

}
