package SeleniumWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicTable {
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\Junaid\\eclipse-workspace\\SeleniumWithJava\\Excel\\SampleData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Dynamic"); 
//		XSSFSheet sheet=workbook.getSheet("Dynamic");
		//To get the Defined Rows in the excel sheet.
		//Here, Un-defined Rows will not print
		// it will tell how many rows are actually defined in the workbook.
		int rows=sheet.getPhysicalNumberOfRows();
		//Need to find how many columns/cells are present
		//here it will iterate through each Row
		for(int i=0;i<rows;i++) //For loop for the Rows
		{
			//here we are getting the Rows dynamically.
			XSSFRow xrow=sheet.getRow(i);//here we are not passing static index, we are passing the Dynamic index i.e. "i"
			
			//Need to identify the Cell count. 
			//cells are present under Row
			//this loop is for cell count
			int cellcount=xrow.getPhysicalNumberOfCells();//we are reading the length of the columns i.e. 5 here
			//here, it will iterate through Each Cell.
			for(int j=0;j<cellcount;j++)//for Loop for the columns
			{
				XSSFCell xcell=xrow.getCell(j);// 1st row - 2nd column
				//Print the entire Data into a Tabular format in console
			String cellValue=getCellValue(xcell);
				System.out.print(" : "+cellValue);// it will print directly
			}
			System.out.println();
		}
		workbook.close();
		fis.close();

	}
//here this method, will identify what type of cell it is	
	public static String getCellValue(XSSFCell cell)
	{
		switch(cell.getCellType())
		{
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());//here, it will convert the data and return's in the form of String.
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case STRING:
			return cell.getStringCellValue();//
		default:
		return cell.getStringCellValue();
		}
	}

}
//getCellType():::it will tell you what kind of data is present inside the cell i.e. String/numeric
	


