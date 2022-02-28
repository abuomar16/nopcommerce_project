package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginPage  extends Base {

	public UserLoginPage(WebDriver driver) {
		super(driver);
	}
	
	 @FindBy(id = "Email")
	 WebElement Email_Text ;
	 
	 @FindBy(id = "Password")
	 WebElement pass_Text ;
	 
	 @FindBy(id  = "RememberMe")
	 WebElement remember_checkbox ; 
	 
	 @FindBy(css = "button.button-1.login-button")
	 WebElement loginBtn ; 
	 
	 
	 public void userlogin( String email ,String password)
	 {
		
	    send_keys(Email_Text, email);
	    send_keys(pass_Text, password);
	    click_Btn(remember_checkbox);
	    click_Btn(loginBtn);
	 }
	 

}
