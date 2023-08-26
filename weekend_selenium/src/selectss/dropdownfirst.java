package selectss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownfirst 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/Software%20Testing%20FS/Advanced%20Sele/html%20codes/Dropdown.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='Maruthi Hotel']"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		sel.selectByIndex(3);
		sel.selectByIndex(5);
		Thread.sleep(2000);
		WebElement opt = sel.getFirstSelectedOption();
		String txt = opt.getText();
		System.out.println(txt);
		driver.close();
	}
}
