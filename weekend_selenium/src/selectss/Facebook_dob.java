package selectss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_dob 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//a [@rel='async']"));
		ele.click();
		Thread.sleep(4000);
		WebElement ele1 = driver.findElement(By.xpath("//select[@title='Day']"));
		Select sel=new Select(ele1);
		sel.selectByVisibleText("14");
		Thread.sleep(4000);
		WebElement ele2 = driver.findElement(By.xpath("//select[@title='Month']"));
		Select sel1=new Select(ele2);
		sel1.selectByVisibleText("Aug");
		Thread.sleep(4000);
		WebElement ele3 = driver.findElement(By.xpath("//select[@title='Year']"));
		Select sel2=new Select(ele3);
		sel2.selectByVisibleText("1997");
		Thread.sleep(4000);
		driver.close();
		
		
		
		
	}
}
