package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream testDataFile=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\TestData.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet=workBook.getSheet("Sheet1");
	int activeRows=testDataSheet.getLastRowNum();
	System.out.println(activeRows);
	for(int rowindex=0;rowindex<=activeRows;rowindex++)
	{
XSSFRow dataRow=testDataSheet.getRow(rowindex); 
int rowofActiveRowofCells=dataRow.getLastCellNum();
System.out.println(rowofActiveRowofCells);

for(int rowofCellIndex=0;rowofCellIndex<rowofActiveRowofCells;rowofCellIndex++)
{
	 XSSFCell dataRowofCell=dataRow.getCell(rowofCellIndex);
	
	String data=dataRowofCell.getStringCellValue();
	System.out.print(data+" | ");
	}

System.out.println();
	}
	
	
	
}
}