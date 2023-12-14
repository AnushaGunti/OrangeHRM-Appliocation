package OrangeHRMTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.Log;

public class BaseTest {
	WebDriver driver;
	 String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\src\\Driver Files\\msedgedriver.exe");
		Log.info("****Edge Browser Launched Successfully*********");
		driver.get(ApplicationUrlAddress);
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		Log.info("*******Edge Browser Closed Successfully*********");
	}
}