package a.ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetmultidata 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./Excel/testdata.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		for(int i=0;i<8;i++)
		{
			Row r = sh.getRow(i);
			Cell cell = r.getCell(i);
			String un = cell.toString();
			System.out.println("username" +un);
		}
		
	}

}
