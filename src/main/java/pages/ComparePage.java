package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparePage extends Base {

	public ComparePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="button.button-2.add-to-compare-list-button")
	public  WebElement compere_btn ;
	
	@FindBy(css = "a")
	WebElement productCompersion_link ;
	
	
	@FindBy(css="h1")
	public WebElement sucessfully_masseage ;
	
	
	public void AddProductToCompere()
	{
		click_Btn(compere_btn);
		click_Btn(productCompersion_link);
	}
	

}
