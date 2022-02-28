package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConectUsPage  extends Base{

	
	public ConectUsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="FullName")
	WebElement name ;
	
	@FindBy(id="Email")
	WebElement Email_text ;
	
	@FindBy(id="Enquiry")
	WebElement Enquiry_text ;
	
	@FindBy(css ="button.button-1.contact-us-button")
	WebElement submit ;
	
	
	public void connectUS(String fullname  , String Email ,String Enquiry )
	{
		send_keys(name, fullname);
		send_keys(Email_text, Email);
		send_keys(Enquiry_text, Enquiry);
		click_Btn(submit);
		
		
	}
	
	
	
	
}
