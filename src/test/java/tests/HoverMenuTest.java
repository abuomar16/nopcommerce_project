package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class HoverMenuTest extends TestBase {

	
	HomePage homeObject ;
	
	@Test
	public void HoverMenuSucessfully()
	{
		
		homeObject = new HomePage(driver) ;
		
		homeObject.opentHoverMenulink();
		
	}
	
}
