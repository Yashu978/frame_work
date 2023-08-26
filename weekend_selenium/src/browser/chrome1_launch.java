package browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class chrome1_launch 
{
	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.close();	
	}

}
