package com.OrangeHRMApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;

public class AddEmployeePage extends BaseTest {
	//ita an object Repository class
	public AddEmployeePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="PIM")
	WebElement pim;
	@FindBy(linkText="Add Employee")
	WebElement addEmployee;
	@FindBy(name="firstName")
	WebElement firstname;
	public void AddEmployee()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(pim).build().perform();
		addEmployee.click();
		firstname.sendKeys("Anusha");
	}

}
