package utilites;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class Helper
{
	 // method to take screenshots 
	
	public static  void  takeScreen ( WebDriver driver , String screenName)
	{
	 
		Path dest = Paths.get("./screenshots" ,screenName+".png") ;
		
		try {
			Files.createDirectories(dest.getParent()) ;
			FileOutputStream out =new FileOutputStream(dest.toString()) ;
			out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES )) ;
			out.close() ;
		} catch (IOException e) {
			System.out.println("EXcuption take screen ") ;
	       }
	
	}
	
}
