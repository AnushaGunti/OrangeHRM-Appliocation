package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteOperations_Multipledata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream testDataFile=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\TestData.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet=workBook.getSheet("Sheet1");
		
		
		XSSFRow testDataRow	=testDataSheet.createRow(2);
			
			
			
		XSSFCell testDataCell=testDataRow.createCell(0);
			
	testDataCell.setCellValue("Test");
			
		
			
			FileOutputStream writedata=new FileOutputStream("C:\\\\Users\\\\HP\\\\OneDrive\\\\Desktop\\\\TestData.xlsx");
			workBook.write(writedata);
			
			
			

}}
