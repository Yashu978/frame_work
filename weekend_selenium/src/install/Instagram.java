package install;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		WebElement ele=driver.findElement(By.name("username"));
		ele.sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		WebElement ele1=driver.findElement(By.name("password"));
		ele1.sendKeys("1234");
		Thread.sleep(1000);
		WebElement ele2=driver.findElement(By.tagName("button"));
		ele2.click();
	}		
}
