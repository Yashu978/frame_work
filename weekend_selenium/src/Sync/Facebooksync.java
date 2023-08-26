package Sync;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooksync 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("OnePlus Mobiles");
		driver.findElement(By.id("email")).sendKeys("Hii");
		driver.findElement(By.id("pass")).sendKeys("Hello");
		driver.findElement(By.name("login")).click();
	}

}
