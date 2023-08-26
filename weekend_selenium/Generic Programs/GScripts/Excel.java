package GScripts;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	public static String get_data(String sheet,int rnum,int cnum)
	{
		String val=" ";
		try
		{
			FileInputStream fis=new FileInputStream("./Excel/testdata.xlsx");
			Workbook book=WorkbookFactory.create(fis);
			//Sheet sh = book.getSheetIndex(sheet);
			//Row r=sh.getRow(rnum);
			//0Cell cel=r.getCell(cnum);
			//val=cel.toString();
		}
		catch(Exception e)
		{
			System.out.println("unable to fetch data");
		}
		return val;
	}
}
