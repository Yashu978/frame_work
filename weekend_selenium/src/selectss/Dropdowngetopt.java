package selectss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowngetopt
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/Advanced%20Sele/html%20codes/Dropdown.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='Maruthi Hotel']"));
		Select sel=new Select(ele);
		List<WebElement> opts = sel.getOptions();
		int count = opts.size();
		System.out.println(count);
		driver.close();
	}
}
