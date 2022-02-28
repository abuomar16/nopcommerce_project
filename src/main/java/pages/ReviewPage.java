package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage  extends Base {

	public ReviewPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText ="Add your review")
	WebElement review_link ;
	
	@FindBy(id="AddProductReview_Title")
	WebElement title ;
	
	@FindBy(id ="AddProductReview_ReviewText")
	WebElement review ;
	
	@FindBy(id ="addproductrating_4")
    WebElement options ;
	
	@FindBy(name = "add-review")
	WebElement submitReview_btn ;
	
	@FindBy(css ="div.result")
	public WebElement sucessfully_masseage ;
	
	
	
	public void addReview( String title_text ,String review_text )
	{
            
	click_Btn(review_link);
	send_keys(title, title_text);
	send_keys(review , review_text);
	click_Btn(options);
	click_Btn(submitReview_btn);
	
	}

}
