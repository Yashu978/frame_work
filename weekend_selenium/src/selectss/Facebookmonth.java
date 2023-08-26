package selectss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookmonth
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Create new account']"));
		ele.click();
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='month']"));
		ele1.click();
		Thread.sleep(2000);
		Select sel=new Select(ele1);
		sel.selectByIndex(3);
		sel.selectByIndex(7);
		sel.selectByIndex(0);
		sel.selectByIndex(5);
		sel.selectByIndex(10);
		Thread.sleep(2000);
		WebElement opt = sel.getFirstSelectedOption();
		String txt = opt.getText();
		System.out.println(txt);
	}

}
