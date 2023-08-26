package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class googlelink 
{
	@Test
	public void google()
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele=driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		String txt = ele.getText();
		System.out.println(txt);
		Assert.assertEquals(txt, "ಕನ್ನಡ");
		System.out.println("verified");	
		ele.click();

}
}
