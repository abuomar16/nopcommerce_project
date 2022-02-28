package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailFriendPage extends Base {

	public EmailFriendPage(WebDriver driver) {
		super(driver);
	
	}
	
	

	@FindBy(id="FriendEmail")
	WebElement friend_Email ;
	
	@FindBy(css ="button.button-2.email-a-friend-button")
	WebElement EmailFriend_link ;
	
	@FindBy(id="PersonalMessage")
	WebElement My_massage ;
	
	@FindBy(css ="button.button-1.send-email-a-friend-button")
	WebElement SendEmail_btn ;
	
	@FindBy(css ="div.result")
	public WebElement sucessfully_masseage ;
	
	
	
	public void sendEmail( String email ,String massage )
	{
		click_Btn(EmailFriend_link);
		send_keys(friend_Email, email);
		send_keys(My_massage, massage);
		click_Btn(SendEmail_btn);
		
		
		
	}
	
	
	
	
	
	
}

