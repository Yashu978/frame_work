package GScripts;

import java.io.File;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class generic_photo 
{
	public static void get_screenshot(WebDriver driver)
	{
		String path="./photos/";
		//Date d = new Date();
		//String d1 = d.toString();
		//d1.replace(":", "-");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src= tss.getScreenshotAs(OutputType.FILE);
		//File dst=new File(path+ date +".jpg");
		//FileHandler.copy(src, dst);
	}

}
