package webele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/Advanced%20Sele/html%20codes/P3.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.tagName("input"));
		boolean b=ele.isSelected();
		System.out.println(b);
		if(b)
		{
			System.out.println("it is checked");
		}
		else
		{
			System.out.println("it is not checked");
		}
	}
}
