package childb;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbro 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[text()='New Window']")).click();
		Thread.sleep(2000);
		String pid = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		int count = allid.size();
		System.out.println(count);
		allid.remove(pid);
		//int size = allid.size();
		for (String id : allid) 
		{
			driver.switchTo().window(id);
			Thread.sleep(2000);
			driver.close();
		}	
	}
}
