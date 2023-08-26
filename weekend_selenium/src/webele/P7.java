package webele;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.id("email"));
		Dimension size = ele.getSize();
		System.out.println(size);
		int h=size.getHeight();
		System.out.println("height is" +h);
		int w=size.getWidth();
		System.out.println("width is" +w);
	}

}
