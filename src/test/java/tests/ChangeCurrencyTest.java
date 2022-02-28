package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class ChangeCurrencyTest extends TestBase {
	
	
	HomePage homeObject  ;
	
	@Test
	public void changeCurrencySucessfully()
	{
		
	homeObject =new  HomePage (driver) ;
	homeObject.checkCurreny();
	}

	
}
