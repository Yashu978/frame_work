package webele;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Point loc = ele.getLocation();
		System.out.println(loc);
		int x=loc.getX();
		System.out.println("x axis is"+x);
		int y=loc.getY();
		System.out.println("y axis is"+y);
	}
}
