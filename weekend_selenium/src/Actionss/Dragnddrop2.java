package Actionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragnddrop2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		Thread.sleep(2000);
		WebElement dst = driver.findElement(By.id("bank"));
		Thread.sleep(2000);
		WebElement s1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		Thread.sleep(2000);
		WebElement d1 = driver.findElement(By.id("amt7"));
		Thread.sleep(2000);
		WebElement s2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		Thread.sleep(2000);
		WebElement d2 = driver.findElement(By.id("loan"));
		Thread.sleep(2000);
		WebElement s3 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		Thread.sleep(2000);
		WebElement d3 = driver.findElement(By.id("amt8"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(src,dst).perform();
		Thread.sleep(2000);
		act.dragAndDrop(s1,d1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(s2,d2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(s3,d3).perform();
	}

}
