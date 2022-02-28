package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends Base {

	public UserRegisterationPage(WebDriver driver) 
	{
		super(driver);
	}


	@FindBy(id = "gender")
	WebElement GenderBtn ;
	@FindBy(id ="FirstName")
	WebElement FnameTxt ;
	@FindBy(id ="LastName")
	WebElement LnameTxt ;

	@FindBy(name  ="DateOfBirthDay")
	WebElement day ;
	@FindBy(name  ="DateOfBirthMonth")
	WebElement month ;
	@FindBy(name  ="DateOfBirthYear")
	WebElement year ;

	@FindBy(id ="Email")
	WebElement EmailTxt  ;
	@FindBy(id ="Company")
	WebElement CompanyNmeTxt ;

	@FindBy(id = "Newsletter")
	WebElement checkBox ;
	@FindBy(id ="Password")
	WebElement passTxt ;
	@FindBy(id ="ConfirmPassword")
	WebElement confirmpassTxt ;

	@FindBy(id = "register-button")
	WebElement registerBtn ;

	@FindBy(css = "div.result")
	public WebElement successfly_massage ;
	
	
	



	public void userRegisteration( String firstName ,String lastName ,String EmailName ,String companyName ,String password)
	{

		//GenderBtn.click();
		click_Btn(GenderBtn) ;

		//FnameTxt.sendKeys(firstName);
		send_keys( FnameTxt  , firstName ) ;

		//LnameTxt.sendKeys(lastName);
		send_keys( LnameTxt  , lastName ) ;

		//Select  option1 = new Select (day) ;
		//option1.selectByIndex(1);
		drop_list(day) ;


		//Select  option2 = new Select (month) ;
		//option2.selectByIndex(1);
		drop_list(month) ;

		//Select  option3 = new Select (year) ;
		//option3.selectByIndex(1);
		drop_list(year) ;

		//EmailTxt.sendKeys(EmailName);
		send_keys( EmailTxt  , EmailName ) ;

		//CompanyNmeTxt.sendKeys(companyName);
		send_keys( CompanyNmeTxt  , companyName ) ;

		//checkBox.click(); 
		click_Btn(checkBox) ;

		//passTxt.sendKeys(password);
		send_keys(passTxt ,password) ;

		//confirmpassTxt.sendKeys(password);
		send_keys(confirmpassTxt ,password) ;

		//registerBtn.click();
		click_Btn(registerBtn) ;
		
		
	}
	
	
}
