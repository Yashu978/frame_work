package GScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Facebook extends Base_facebook
{
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("Hello");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("World");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
	}
}
