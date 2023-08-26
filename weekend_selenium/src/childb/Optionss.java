package childb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Optionss 
{
	public static void main(String[] args) 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable notifications");
		opt.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com");	
	}

}
