package a.ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedata 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./Excel/testdata.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh = book.createSheet("qsp");
		Row r = sh.createRow(0);
		Cell cel = r.createCell(0);
		cel.setCellValue("Rajajinagar");
		FileOutputStream fout=new FileOutputStream("./Excel/testdata.xlsx");
		book.write(fout);
		
	}

}
