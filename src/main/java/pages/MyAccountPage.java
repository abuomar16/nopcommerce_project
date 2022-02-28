package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Base {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "My account")
	WebElement Myaccount_link ;
	
	@FindBy(linkText = "Change password" )
	WebElement ChangePassword_link ;
	
	@FindBy(id = "OldPassword")
	WebElement Old_Password ;
	
	@FindBy(id = "NewPassword")
	WebElement New_Password ;
	
	@FindBy(id = "ConfirmNewPassword")
	WebElement Confirm_NewPassword ;
	
	@FindBy(css= "button.button-1.change-password-button")
	WebElement ChangePass_btn ;
	
	@FindBy(css = "p.content")
	public WebElement successfly_massage ;
	
	
	public void changePassword(String oldpass  ,String newpass)
	{
		click_Btn(Myaccount_link);
		click_Btn(ChangePassword_link);
		send_keys(Old_Password, oldpass);
		send_keys(New_Password, newpass);
		send_keys(Confirm_NewPassword, newpass);
		click_Btn(ChangePass_btn);
		
	}
	
	
	

}
