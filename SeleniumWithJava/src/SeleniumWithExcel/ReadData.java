package SeleniumWithExcel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class ReadData 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Junaid\\\\eclipse-workspace\\\\SeleniumWithJava\\\\Excel\\\\creatingexcellsheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
//      System.out.println(cell);
		System.out.println(sheet.getRow(1).getCell(0));	
	}
}


