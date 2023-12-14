package OHRM;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.Log;

public class EmployeeListTest extends personalDetails {
	XSSFSheet sheet1;
	@Test(priority=12,description="EmployeeListPage")
	public void EmployeeList()
	{
		By employeeListProperty=By.linkText("Employee List");
		WebElement employeeList =driver.findElement(employeeListProperty);
		employeeList.click();
	}
	@Test(priority=13,description="EmployeeList table")
	public void EmployeeListTable() throws IOException
	{
		//identifying the Employee TAble
		///html/body/div[1]/div[3]/div[2]/div/form
	    By employeeListTableProperty=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form")	;
	   WebElement employeeListTable=driver.findElement(employeeListTableProperty);
	   //identifying the RowProperty in the table
	  // <tr class="even">
	  By rowProperty=By.tagName("tr");
      List<WebElement>row=employeeListTable.findElements(rowProperty);
      
      for(int RowOfIndex=1;RowOfIndex<row.size();RowOfIndex++)
      {
    	  //Going to A Particaular row
    	 WebElement  tableofrow=row.get(RowOfIndex);
    	 
             XSSFRow row1=sheet.createRow(2);
    	 
    	 //Identifying the Cell Property int he Row
    	 //<td class="left">
    	 By cellproperty=By.tagName("td");
    	List<WebElement>cell=tableofrow.findElements(cellproperty);
    	for(int CellOfIndex=0;CellOfIndex<cell.size();CellOfIndex++)
    	{
    		
    		//going to a Particular cell in the Row
    		WebElement tableofcell=cell.get(CellOfIndex);
    		String EmployeeDetails=tableofcell.getText();
    		
    		 XSSFCell cell1=row1.createCell(CellOfIndex);
    		 cell1.setCellValue(EmployeeDetails);
           	Log.info(EmployeeDetails+ "|");
    	}
    	
      }
      FileOutputStream dataFile=new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\OrangeHRMApplication\\Excel File\\OrangeHRM.xlsx");
		 workbook.write(dataFile);
		 
       
	}
	
	@Test(priority=14,description="LogOut Functionality")
	public void Logout() throws InterruptedException
	{
		//welcome Admin Property
		By welComeAdminProperty=By.id(properties.getProperty("OrangeHRMHomePageWelComeAdminProperty"));
		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
		welComeAdmin.click();
		Thread.sleep(3000);
		//LogOut property
		By logoutProperty=By.xpath(properties.getProperty("OrangeHRMApplicationLogOutProperty"));
		WebElement logout=driver.findElement(logoutProperty);
		
		logout.click();
	}
	@Test(priority=15,description="LogIn Page Validation")
	public void LogInPage() throws IOException
	{
		cell=row.getCell(0);
		String expected_LogInpanelText=cell.getStringCellValue();
        Log.info("The Expected Text of the LoginPanel is:-"+expected_LogInpanelText);
        By LogInPanelText=By.id(properties.getProperty("OrangeHRMHomePageLogInPanelTextProperty"));
        WebElement LogInPanel=driver.findElement(LogInPanelText);
        String actual_loginpanel= LogInPanel.getText();
        Log.info("The Actual Text of the LogInPanel is:-"+actual_loginpanel);
        cell=row.createCell(25);
        cell.setCellValue(actual_loginpanel);
        dataFile=new FileOutputStream("./Excel File/OrangeHRM.xlsx");
        workbook.write(dataFile);
        //validating the LogInPAnel Text
        if(actual_loginpanel.equals(expected_LogInpanelText))
        {
        	Log.info("The Text of the LogInPAnel is Matched :-PASS");
        	cell=row.createCell(26);
        	cell.setCellValue("PASS");
        	dataFile=new FileOutputStream("./Excel File/OrangeHRM.xlsx");
            workbook.write(dataFile);
        }
        else
        {
        	Log.info("The Text of the LogInPAnel is Matched :-PASS");
        	cell=row.createCell(26);
        	cell.setCellValue("File");
        	dataFile=new FileOutputStream("./Excel File/OrangeHRM.xlsx");
            workbook.write(dataFile);
        }
        
	}

}
