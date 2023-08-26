package browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class multi_brows_launch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(4000);
		driver.close();
		EdgeDriver driver1 = new EdgeDriver();
		Thread.sleep(4000);
		driver.close();
	}
}
