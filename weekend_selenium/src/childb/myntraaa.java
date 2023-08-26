package childb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntraaa 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement ser = driver.findElement(By.xpath("//input[@class = 'desktop-searchBar']"));
		ser.sendKeys("puma shoes");
		Thread.sleep(2000);
		ser.sendKeys(Keys.ENTER);
		WebElement ele = driver.findElement(By.xpath("//div[text()='Sort by : ']/../../../../../../../div[2]//ul[1]/li[5]"));
		ele.click();
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//button[text()='Size Chart']"));
		ele2.click();
		Thread.sleep(2000);
		WebElement ele3 = driver.findElement(By.xpath("//td[text()='7']"));
		ele2.click();
		Thread.sleep(2000);
		WebElement ele4 = driver.findElement(By.xpath("//div[text()='ADD TO BAG']"));
		ele3.click();
		Thread.sleep(2000);
		driver.close();
	}

}
