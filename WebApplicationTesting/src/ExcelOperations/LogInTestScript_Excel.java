package ExcelOperations;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;

public class LogInTestScript_Excel {
    WebDriver driver;
    String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
    FileInputStream testDataFile;
    SXSSFWorkbook workBook;
    XSSFSheet testDatasheet;
    Row testDataRow;
    public void ApplicationLaunch() {
    	System.setProperty("Webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\src\\Driver Files\\msedgedriver.exe" );
    }
	public static void main(String[] args) {
		LogInTestScript_Excel al=new LogInTestScript_Excel();
		al.ApplicationLaunch();
		

	}

}