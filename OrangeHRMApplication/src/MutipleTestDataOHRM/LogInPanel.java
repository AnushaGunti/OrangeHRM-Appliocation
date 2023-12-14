package MutipleTestDataOHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LogInPanel extends BaseTest {
	FileInputStream testdata;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	FileOutputStream dataFile;
	FileInputStream propertiesFile;
	Properties properties;
	
	
	@Test(priority=1,description="Validating the LoginPage Functionality og orangrHRM Application")
	public void LogInPanelPageTest() throws IOException
	{
		testdata=new FileInputStream("./Excel File/OrangeHRM.xlsx");
		workbook=new XSSFWorkbook(testdata);
		sheet=workbook.getSheet("sheet2");
		row=sheet.getRow(1);
		cell=row.getCell(0);
		String expected_LogInpanel_Text=cell.getStringCellValue();
		propertiesFile=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\OrangeHRMApplication\\src\\com\\config\\orangeHRM.properties");
	    properties=new Properties();
	    properties.load(propertiesFile);
		By logInPanelTextproperty=By.id(properties.getProperty("OrangeHRMHomePageLogInPanelTextProperty"));	
	}
	

}
