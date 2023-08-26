package selectss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownalloptions
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/Software%20Testing%20FS/Advanced%20Sele/html%20codes/Dropdown.html");
		WebElement e = driver.findElement(By.xpath("//select[@id='Maruthi Hotel']"));
		Select s=new Select(e);
		s.selectByIndex(1);
		s.selectByIndex(3);
		s.selectByIndex(4);
		Thread.sleep(4000);
		List<WebElement> opts = s.getAllSelectedOptions();   //ALL
		int count = opts.size();
		System.out.println(count);
		for (WebElement opt : opts) 
		{
			String text = opt.getText();
			System.out.println(text);
		}
		Thread.sleep(2000);
		driver.close();
	}
	

}
