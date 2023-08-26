package popupss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploads 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/Software%20Testing%20FS/Advanced%20Sele/html%20codes/FileUpload.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("C:\\Users\\Lenovo\\Downloads\\shiraito-waterfall-autumn-japan_335224-193.avif");
	}

}
