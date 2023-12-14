package OrangeHRMTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {
	@Test(priority=1,description="Testing the Functionality of LOGIN Panel")
	public void Logintest() throws IOException
	{ 
		FileInputStream testdata=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Copy of OHRM_LogInTestData(416).xlsx");
	    XSSFWorkbook workBook=new XSSFWorkbook(testdata);
        XSSFSheet testdataSheet=workBook.getSheet("Sheet1");
        XSSFRow testdataRow=testdataSheet.getRow(0);
        XSSFCell testdatacell=testdataRow.getCell(0);
        String testdatacellValue=testdatacell.getStringCellValue();
	}

}
