package MutipleTestDataOHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
	String OrangeHRMApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
@BeforeTest
	public void setUp()
   {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\OrangeHRMApplication\\Driver Files\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(OrangeHRMApplicationUrlAddress);
	}
@AfterTest
public void tearDown()
{
	driver.quit();
}
}
