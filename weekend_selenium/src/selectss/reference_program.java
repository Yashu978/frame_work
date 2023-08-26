package selectss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class reference_program 
{

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Lenovo/Desktop/Software%20Testing%20FS/Advanced%20Sele/html%20codes/Dropdown.html");
			WebElement ele = driver.findElement(By.xpath("//select[@id='Maruthi Hotel']"));
			Select sle=new Select(ele);
			sle.selectByIndex(1);
			sle.selectByValue("d");
			sle.selectByVisibleText("Boti");
			WebElement fs = sle.getFirstSelectedOption();    //!st
			String text1 = fs.getText();
			System.out.println(text1);
			
			 List<WebElement> al = sle.getAllSelectedOptions();   //ALL
		int size = al.size();
		for (WebElement webElement : al) {
			String text = webElement.getText();
			System.out.println(text);
		}
			List<WebElement> options = sle.getOptions();
			
		for (WebElement webElement : options) {
				String text2 = webElement.getText();
				System.out.println(text2);
				
			}
			
			Thread.sleep(5000);
			driver.close();

		}
		}


	
