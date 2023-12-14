package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;
	String OrangeHRMApplicationURL="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\MyMavenProject\\Driver Files\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(OrangeHRMApplicationURL);
		driver.manage().window().maximize();
	}
	/*@AfterTest
	public void tearDown()
	{
		driver.quit();
	}*/

}
