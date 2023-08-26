package jasel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazonfetch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		String src=driver.getPageSource();
		System.out.println(src);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}

}
