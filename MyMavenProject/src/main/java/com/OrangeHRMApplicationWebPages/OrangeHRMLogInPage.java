package com.OrangeHRMApplicationWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class OrangeHRMLogInPage {
	//its An Object Repository class
	
	public OrangeHRMLogInPage(WebDriver driver)//This is called as constructor when the java class name is similar to method name
	{
		PageFactory.initElements(driver,this);
	}
	// id=="logInPanelHeading"
	//@FindBy is an annotation of POM,used to locate an Element
	// 1.Identify the Element of the WebPage
	@FindBy(id="logInPanelHeading")
	WebElement logInPanel;
	// 2.Performing an Operation on the Element of the WebPage 
	public void ValidatingLogInPanelText()
	{
		String expected_LogInPanel_Text="LOGIN Panel";
		Log.info("The Expected Text of the LogInPanel is:-"+expected_LogInPanel_Text);
		String actual_logInPanel_Text=logInPanel.getText();
		Log.info("The Actual Text of the logInPanel is:-"+actual_logInPanel_Text);
		if(actual_logInPanel_Text.equals(expected_LogInPanel_Text))
		{
			Log.info("PASS");
	
		}
		else
     	{
			Log.info("FAIL");
		}
				
	}
	///html/body/div[1]/div/div[2]/div/img
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/img")
	WebElement orangeHRMlogoOfLogInPage;
	public void LogOfLogInPage() 
	{
		boolean falg=orangeHRMlogoOfLogInPage.isDisplayed();
		if(falg)
		{
			Log.info("PASS");
		}
		else
		{
			Log.info("FAIL");
		}
	}
	@FindBy(name="txtUsername")
	WebElement username;
	@FindBy(name="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement logInButton;
	
	public void ValidatingtheUserdataText(String UserName,String Password)
	{
		username.sendKeys(UserName);
		password.sendKeys(Password);
		logInButton.click();

	}
	
	
	@FindBy(id="welcome")
	WebElement welcomeAdmin;
	public void ValidatingWelComeAdminText()
	{
		String expected_welcomeAdmin_Text="Welcome Admin";
		Log.info("The Expected Text of the Welcome Admin is:-"+expected_welcomeAdmin_Text);
		
	String	actual_welcomeAdmin_Text=welcomeAdmin.getText();
	Log.info("The Actual Text of the Welcome Admin Is:-"+actual_welcomeAdmin_Text);
	if(actual_welcomeAdmin_Text.equals(expected_welcomeAdmin_Text))
	{
		Log.info("PASS");
	}
	else
	{
		Log.info("FAIL");
	}
	}
	

}
	


