package TNGG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebookNG 
{
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("yashuveeresh@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Yashu@1408");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		driver.close();
	}
}
