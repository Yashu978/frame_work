package webele;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/Advanced%20Sele/html%20codes/Qsp.html");
		WebElement ele = driver.findElement(By.tagName("input"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.id("a2"));
		ele1.sendKeys(Keys.CONTROL+"v");
		
	}

}
