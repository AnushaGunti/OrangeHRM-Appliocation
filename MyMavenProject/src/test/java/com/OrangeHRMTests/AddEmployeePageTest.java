package com.OrangeHRMTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationWebPages.AddEmployeePage;

public class AddEmployeePageTest extends orangeHRMLogInPageTest {
	@Test(priority=5,description="AddEmployee Page Test Functionality")
	public void AddEmployeetest()
	{
		AddEmployeePage addemployee=new AddEmployeePage();
		addemployee.AddEmployee();
		
	}
	

}
