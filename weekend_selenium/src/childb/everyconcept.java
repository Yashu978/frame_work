package childb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class everyconcept {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("Yashaswini");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("V");
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys("yashuveeresh@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9231456798");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		WebElement mon = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		mon.click();
		Select sel1 = new Select(mon);
		sel1.selectByValue("7");
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		year.click();
		Select sel2 = new Select(year);
		sel2.selectByValue("1997");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='14']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("Selenium");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Music']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Lenovo\\Downloads\\shiraito-waterfall-autumn-japan_335224-193.avif");
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("C/O Veeresh, 70 Shimoga");
		WebElement ele1 = driver.findElement(By.xpath("//div[@class= ' css-tlfecz-indicatorContainer' and @aria-hidden='true']"));
		ele1.click();
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement ele2 = driver.findElement(By.xpath("//div[@class= ' css-1wa3eu0-placeholder']"));
		ele2.click();
		Thread.sleep(1000);
		Robot r1=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

}
