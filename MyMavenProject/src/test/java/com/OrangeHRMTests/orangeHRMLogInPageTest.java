package com.OrangeHRMTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationWebPages.OrangeHRMLogInPage;

public class orangeHRMLogInPageTest extends BaseTest{
	
	OrangeHRMLogInPage logInPageTest;
	@Test(priority=1,description="Validating the LogInPanelTest")
	public void LogInPanelTextTest()
	{
		 logInPageTest=new OrangeHRMLogInPage(driver);
		 logInPageTest.ValidatingLogInPanelText();
	}
	@Test(priority=3,description="Validating the LOGO")
	public void LOGOTest()
	{
		 logInPageTest=new OrangeHRMLogInPage( driver);
		logInPageTest.LogOfLogInPage();
	}
	@Test(priority=2,description="Giving Valid Data")
	public void UserData()
	{
		logInPageTest=new OrangeHRMLogInPage(driver);
		logInPageTest.ValidatingtheUserdataText("Anusha", "GuntiAnusha@123");
		
	}
	
	@Test(priority=4,description="Validating the WelCome Admin")
	public void welcomeAdminTextTest() 
	{
	  logInPageTest=new OrangeHRMLogInPage(driver);
	  logInPageTest.ValidatingWelComeAdminText();
	  
	}

}
