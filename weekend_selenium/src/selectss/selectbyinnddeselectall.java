package selectss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectbyinnddeselectall
{
	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/Advanced%20Sele/html%20codes/Dropdown.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='Maruthi Hotel']"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByValue("d");
		Thread.sleep(2000);
		sel.selectByVisibleText("Boti");
		Thread.sleep(2000);
		sel.deselectAll();
		Thread.sleep(2000);
		driver.close();
	}

}
