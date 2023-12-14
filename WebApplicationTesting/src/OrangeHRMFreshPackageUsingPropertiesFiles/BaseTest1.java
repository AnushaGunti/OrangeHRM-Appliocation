package OrangeHRMFreshPackageUsingPropertiesFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest1 {
	WebDriver driver;
	String OHRMUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void setup()
	{
		//Automating the Edge Browser
	System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\src\\Driver Files\\msedgedriver.exe");
	driver=new EdgeDriver();
	//Navigating to OrangeHRM url Address
	driver.get(OHRMUrlAddress);
	System.out.println("Successfully navigated to OrangeHRM Application");
	driver.manage().window().maximize();
	
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		System.out.println("Successfully browsewr has closed");
	}

}
