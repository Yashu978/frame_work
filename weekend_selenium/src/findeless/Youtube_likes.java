package findeless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_likes
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//input[@name='search_query']"));
		ele.sendKeys("Jagave Ninadu");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(5000);
		WebElement e2 = driver.findElement(By.xpath("//a[@title='Prithvi | HD Video Song | Jagave Ninadu | Puneeth Rajkumar | Parvathi Menon | Manikanth Kadri']"));
		e2.click();
		Thread.sleep(3000);
		WebElement e3= driver.findElement(By.xpath("//button[@aria-label='Share']/../../../"
				+"ytd-segmented-like-dislike-button-renderer/yt-smartimation"
				+"//span[@class='yt-core-attributed-string yt-core-attributed-string--"
				+"white-space-no-wrap']"));
		String txt=e3.getText();
		System.out.println(txt);
		
	}
}
