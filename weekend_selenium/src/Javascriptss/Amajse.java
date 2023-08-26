package Javascriptss;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amajse 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Facebook']"));
		Point loc = ele.getLocation();
		System.out.println(loc);
		int x = loc.getX();
		System.out.println("x axis is"+x);
		int y = loc.getY();
		System.out.println("y axis is"+y);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+(x-200)+","+(y-200)+")");
		Thread.sleep(2000);
		ele.click();
	}

}