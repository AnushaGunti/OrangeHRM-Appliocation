package NewOrangeHRMAssignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangrHRMLogInTest {
	WebDriver driver;
	String ApplicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
    public void LogInPanelTest() throws IOException
    {
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\src\\Driver Files\\msedgedriver.exe");
        driver=new EdgeDriver();
        driver.get(ApplicationURLAddress);
        //id="logInPanelHeading"
     By   LogInPanelProperty=By.id("logInPanelHeading");
   WebElement  LogInPanel =driver.findElement(LogInPanelProperty);
  LogInPanel.getText();
  System.out.println("The Text of the LogInPAnel Is:-"+LogInPanel);
  //id="txtUsername"
  FileInputStream testdata=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\TestData.xlsx");
  XSSFWorkbook testdataworkbook=new XSSFWorkbook(testdata);
  XSSFSheet testdatasheet=testdataworkbook.getSheet("Sheet1");
  XSSFRow testdatarow=testdatasheet.getRow(0);
  XSSFCell testdatacell=testdatarow.getCell(0);
  String testdatacellvalue=testdatacell.getStringCellValue();
  By UserNameProperty=By.id("txtUsername");
 WebElement UserName=driver.findElement(UserNameProperty);
 UserName.sendKeys(testdatacellvalue);
 //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
 By UserPasswordProperty=By.id("txtPassword");
 XSSFCell testdatacells=testdatarow.getCell(1);
 String testdatacellvalues=testdatacell.getStringCellValue();
WebElement Userpassword=driver.findElement(UserPasswordProperty);
Userpassword.sendKeys("GuntiAnusha@123");
//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
By LogInProperty=By.id("btnLogin");
    }
    public static void main(String[]args) throws IOException
    {
    	OrangrHRMLogInTest LogInPanel=new OrangrHRMLogInTest();
    	LogInPanel.LogInPanelTest();
    }
}
