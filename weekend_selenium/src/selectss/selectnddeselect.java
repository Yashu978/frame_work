package selectss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectnddeselect 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Lenovo/Desktop/Software%20Testing%20FS/Advanced%20Sele/html%20codes/Dropdown.html");
	WebElement ele = driver.findElement(By.xpath("//select[@id='Maruthi Hotel']"));
	Select sel=new Select(ele);
	boolean b=sel.isMultiple();
	System.out.println(b);
	if(b)
	{
		System.out.println("Its multiselect");
	}
	else
	{
		System.out.println("Its singleselect");
	}
	List<WebElement> sel1 = sel.getOptions();
	int count = sel1.size();
	System.out.println(count);
	Thread.sleep(2000);
	sel.selectByIndex(1);
	sel.selectByIndex(2);
	sel.selectByIndex(3);
	Thread.sleep(2000);
	for(int i=0;i<count;i++)
	{
		if(i%2==0)
		{
			sel.deselectByIndex(i);
		}
		}
	}
}