package popupss;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttandconfirmss 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("qwerty");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Alert alt = driver.switchTo().alert();
		String txt=alt.getText();
		System.out.println(txt);
		Thread.sleep(2000);
		alt.accept();
		//alt.dismiss();
	}
}
