package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	
	public WebDriver driver ;
	public Actions action  ;
	
	//constructor
	public Base( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void click_Btn ( WebElement Button)
	{ 
		Button.click() ;	
	}
	
	public static void send_keys ( WebElement Text , String value)
	{
		Text.sendKeys(value) ;	
	}
	
	public static void drop_list ( WebElement option )
	{
		Select  object = new Select (option) ;
		object.selectByIndex(1);
	}
	
	

}