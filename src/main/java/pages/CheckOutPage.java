package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Base {

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(id ="BillingNewAddress_CountryId")
	WebElement Country ;
	
	@FindBy(id ="BillingNewAddress_StateProvinceId")
	WebElement state ;
	
	
	@FindBy(id ="BillingNewAddress_City")
	WebElement city ;
	
	@FindBy(id ="BillingNewAddress_Address1")
	WebElement Address1 ;
	
	@FindBy(id ="BillingNewAddress_ZipPostalCode")
	WebElement ZipPostalCode ;
	
	@FindBy(id ="BillingNewAddress_PhoneNumber")
	WebElement PhoneNumber ;
	
	@FindBy(name  ="save")
	WebElement confirm_btn ;
	
	////////////////////////////////////////////////////
	
	@FindBy(id ="shippingoption_1")
	WebElement option1 ;
	
	@FindBy(css ="button.button-1.shipping-method-next-step-button")
	WebElement continue_btn1 ;
	
	////////////////////////////////////////////////
	@FindBy(id ="paymentmethod_0")
	WebElement pay0 ;
	
	@FindBy(css ="button.button-1.payment-method-next-step-button")
	WebElement continue_btn2 ;
	///////////////////////////////////////////////////////
	@FindBy(css ="button.button-1.payment-info-next-step-button")
	WebElement continue_btn3 ;
	////////////////////////////////////////////////////////////
	@FindBy(css ="button.button-1.confirm-order-next-step-button")
	WebElement submit_btn ;
	////////////////////////////////////////////
	@FindBy(css = "div.title")
	public WebElement successfly_massage ;
	
	
	public void check(String text1 ,String text2 ,String text3 ,String text4) throws InterruptedException
	{
		drop_list(Country);
		Thread.sleep(2000);
		drop_list(state);
		
		send_keys(city, text1);
		send_keys(Address1, text2);
		send_keys(ZipPostalCode, text3);
		send_keys(PhoneNumber, text4);
		click_Btn(confirm_btn);
		Thread.sleep(2000);
		
		click_Btn(option1);
		click_Btn(continue_btn1);
		Thread.sleep(2000);
		
		click_Btn(pay0);
		click_Btn(continue_btn2);
		Thread.sleep(2000);
		
		click_Btn(continue_btn3);
		Thread.sleep(2000);
		
		click_Btn(submit_btn);
		Thread.sleep(2000);
		
	}
	
	
	
	
}
