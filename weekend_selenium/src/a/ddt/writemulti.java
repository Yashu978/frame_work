package a.ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class writemulti 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		for (WebElement link : links) 
		{
			String att = link.getAttribute("href");
			FileInputStream fis=new FileInputStream("./Excel/testdata.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sh = book.getSheet("Sheet2");
			for(int i=0;i<count;i++)
			{
				Row r = sh.createRow(i);
				Cell cel = r.createCell(0);
				cel.setCellValue(att);
			}
			FileOutputStream fout=new FileOutputStream("./Excel/testdata.xlsx");
			book.write(fout);
		}
	}

}
