package tests;

import org.testng.annotations.Test;

import pages.ConectUsPage;
import pages.HomePage;

public class ConnectUsTest extends TestBase {
	
	
	HomePage homeObject  ;
	
	ConectUsPage connectObject ;
	
	@Test
	public void connectUsSucessfully()
	{
		homeObject =new  HomePage (driver) ;
		homeObject.openConectUslink();
		connectObject = new  ConectUsPage (driver) ;
		connectObject.connectUS("mohamed", "ma20@gmail.com", " i love Automation Testing" );
	}

}
