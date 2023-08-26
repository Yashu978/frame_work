package findeless;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxcndunc
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/Software%20Testing%20FS/Advanced%20Sele/html%20codes/checkbox.html");
		List<WebElement> eles = driver.findElements(By.xpath("//input"));
		int count=eles.size();
		for(WebElement ele:eles)
		{
			Thread.sleep(1000);
			ele.click();
		}
		for (int i = count-1; i >=0; i--) 
		{
			WebElement ele=eles.get(i);
			Thread.sleep(1000);
			ele.click();
			
		}
			
		}
			
		}
	
