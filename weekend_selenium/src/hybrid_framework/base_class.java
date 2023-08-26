package hybrid_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base_class 
{
	public static WebDriver driver;
	@BeforeMethod
	public void Open_app()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void Close_app()
	{
		driver.close();
	}

}
