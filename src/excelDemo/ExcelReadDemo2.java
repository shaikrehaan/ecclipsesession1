package excelDemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReadDemo2
{

	@Test
	public void FileinputStream() throws IOException
	{
		
	FileInputStream fileInput=new FileInputStream("C:\\Users\\rehaan\\Desktop\\SeleniumTask\\IODemo\\Testdata.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(fileInput);
			
XSSFSheet sheet=book.getSheet("Sheet1");
XSSFRow row=sheet.getRow(2);
XSSFCell cell=row.getCell(3);
String celldata=cell.getStringCellValue();
System.out.println(celldata);
}
}
