package Frms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frm1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/Advanced%20Sele/html%20codes/Main%20Page.html");
		Thread.sleep(2000);
		driver.findElement(By.id("u1")).sendKeys("Hii");
		Thread.sleep(2000);
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("i1");
		WebElement frm=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frm);
		driver.findElement(By.id("p1")).sendKeys("World");
		
	}

}
