package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends Base {

	public WishListPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="add-to-wishlist-button-4")
	WebElement wishlist_btn ;

	@FindBy(css = "a")
	WebElement wishlist_link ;

	@FindBy(name  = "updatecart")
	WebElement remove_btn ;




	@FindBy(css ="div.no-data")
	public WebElement sucessfully_masseage ;


	public void addProduct(  ) throws InterruptedException
	{

		click_Btn(wishlist_btn) ;
		Thread.sleep(2000);
		click_Btn(wishlist_link) ;
		Thread.sleep(2000);
		click_Btn(remove_btn) ;
		//click_Btn(wishlist_btn) ;

	}


}
