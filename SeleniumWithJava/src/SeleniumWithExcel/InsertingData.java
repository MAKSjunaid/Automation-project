package SeleniumWithExcel;

import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InsertingData {

	public static void main(String[] args) throws Exception 
	{
		XSSFWorkbook wbook=new XSSFWorkbook();
		XSSFSheet xsheet=wbook.createSheet("First Sheet");
		
		XSSFRow row0=xsheet.createRow(0);
		row0.createCell(0).setCellValue("Mohd");
		row0.createCell(1).setCellValue("Junaid");
		row0.createCell(2).setCellValue(4562);
		row0.createCell(3).setCellValue(5231);
		
		XSSFRow row1=xsheet.createRow(1);
		row1.createCell(0).setCellValue("MD");
		row1.createCell(1).setCellValue("Moiz");
		row1.createCell(3).setCellValue("Ahmed");
		row1.createCell(4).setCellValue(5231);
		
		XSSFRow row2=xsheet.createRow(2);
		row2.createCell(0).setCellValue("Nizam");
		row2.createCell(1).setCellValue("Sarkar");
		row2.createCell(2).setCellValue("Rejected");
		row2.createCell(3).setCellValue(007);
		
		FileOutputStream FOS=new FileOutputStream("C:\\Users\\Junaid\\eclipse-workspace\\SeleniumWithJava\\Excel\\creatingexcellsheet.xlsx");
		wbook.write(FOS);
		FOS.close();
	}

}
