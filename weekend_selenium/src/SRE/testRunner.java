package SRE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testRunner 
{
	@Test
	public void face() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		POM_script p=new POM_script(driver);
		p.UN_enter().sendKeys("hi");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.UN_enter().sendKeys("world");
	}
}
