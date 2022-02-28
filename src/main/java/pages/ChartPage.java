package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChartPage extends Base {

	public ChartPage(WebDriver driver) {
		super(driver);
	}
	

	 @FindBy(id = "add-to-cart-button-4")  
	 WebElement chart_btn ;
	
	 @FindBy(linkText  ="shopping cart") 
	 WebElement shoppingCart_link ; ;

	 @FindBy( id ="termsofservice")
	 WebElement terms_check  ;  
	 
	 @FindBy(id = "checkout")  
	 WebElement checkout_btn ;
	 
	 
	 
	 public void addToCart() throws InterruptedException
	 {
	 click_Btn(chart_btn);
	 Thread.sleep(2000);
	 click_Btn(shoppingCart_link);
	 }
	 
	 public void CheckOUT()
	 {
		click_Btn(terms_check);
		click_Btn(checkout_btn);
	 }
}
