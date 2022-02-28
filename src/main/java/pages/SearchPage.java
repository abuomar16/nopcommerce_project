package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends Base {

	public SearchPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "small-searchterms")
	WebElement search_text ;

	@FindBy(css = "button.button-1.search-box-button")
	WebElement search_btn ;

	@FindBy(id = "ui-id-1")
	List<WebElement> product_list ;

	@FindBy(css = "div.product-name")
	public WebElement sucessfuly_massage ;

	public void searchText( String text ) throws InterruptedException 
	{
		
		//SetTextElementText(search_text  ,text) ;
		send_keys(search_text, text);
		Thread.sleep(3000);
		product_list.get(0).click();;
	}


}
