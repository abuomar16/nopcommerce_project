package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends Base {

	public HomePage(WebDriver driver) 
	{
		super(driver);	 
		action = new Actions(driver) ;
	}

	@FindBy(linkText = "Register")
	WebElement registerlink ;
	
	@FindBy(linkText = "Log in")
	WebElement loginlink ;
	
	@FindBy(linkText = "My account")
	WebElement Myaccountlink ;
	
	@FindBy(linkText = "Log out")
	WebElement LogOutlink ;
	
	@FindBy(linkText ="Contact us")
	WebElement Contact_us ;
	
	@FindBy(id ="customerCurrency")
	WebElement currency_checkBox ;
	
	@FindBy(linkText = "Computers")
	WebElement copmuterMenu_link ;
	@FindBy(linkText  ="Software")
	WebElement Software_link ;

	
	

	public void openRegisterLink()
	{
		click_Btn(registerlink);
	}
	
	public void openLoginLink()
	{
		click_Btn(loginlink);
	}
	
	public void userlogout()
	{
	    click_Btn(LogOutlink);
	}
	
	public void openMyaccountlink()
	{
		click_Btn(Myaccountlink);
	}
	
	public void openConectUslink()
	{
		click_Btn(Contact_us);
	}
	
	public void checkCurreny()
	{  
		drop_list(currency_checkBox);
	}
	
	public void opentHoverMenulink()
	{ 
	    action.moveToElement(copmuterMenu_link).moveToElement(Software_link).click().build().perform();	
	}
	
}

