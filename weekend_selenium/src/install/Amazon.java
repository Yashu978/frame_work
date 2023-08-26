package install;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("oneplus");
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.id("nav-search-submit-text"));
		ele1.click();
	}
}
