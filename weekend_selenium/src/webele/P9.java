package webele;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/Advanced%20Sele/html%20codes/Manual.html");
		WebElement ele = driver.findElement(By.id("a1"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.id("a3"));
		Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.id("a2"));
		Thread.sleep(2000);
		ele2.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		WebElement ele3 = driver.findElement(By.id("a1"));
		Thread.sleep(2000);
		ele3.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		WebElement ele4 = driver.findElement(By.id("a3"));
		Thread.sleep(2000);
		ele4.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		WebElement ele5 = driver.findElement(By.id("a2"));
		Thread.sleep(2000);
		ele5.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);	
	}

}
