package jasel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbfetch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
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
