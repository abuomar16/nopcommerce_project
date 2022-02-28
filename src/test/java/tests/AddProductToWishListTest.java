package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SearchPage;
import pages.WishListPage;

public class AddProductToWishListTest  extends TestBase {

	
	SearchPage searchObject ;
	WishListPage wishlistObject ;
	
	@Test
	public void addToWishlistSucessfully () throws InterruptedException
	{
	
		searchObject = new SearchPage(driver);
		wishlistObject =  new WishListPage(driver);
		
		searchObject.searchText("Apple mac");
		wishlistObject.addProduct();
		
		Assert.assertTrue(wishlistObject.sucessfully_masseage.getText().contains("The wishlist is empty!"));
			
	}
}
