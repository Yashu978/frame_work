package findeless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flip_amaz_comparision 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple iPhone 11 (64GB) - White");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement e=driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (64GB) - White']/../../../..//span[@class='a-price-whole']"));
		String Price1=e.getText();
	 String Am = Price1.replaceAll(",", "");
		int Amazon = Integer.parseInt(Am);
		System.out.println(Amazon);
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone 11 White");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']/../..//div[@class='_30jeq3 _1_WHN1']"));
		String Price2=e1.getText();
		String i = Price2.substring(1);
		String Flip=i.replaceAll(",", "");
		int Flipkart = Integer.parseInt(Flip);
		System.out.println(Flipkart);
		if(Amazon>Flipkart)
		{
			System.out.println("Amazon price is high");
		}
		else if(Amazon<Flipkart)
		{
			System.out.println("Flipkart price is high");
		}
		else if(Amazon == Flipkart)
		{
			System.out.println("Flipkart & Amazon has same price");		

		}	
}
}