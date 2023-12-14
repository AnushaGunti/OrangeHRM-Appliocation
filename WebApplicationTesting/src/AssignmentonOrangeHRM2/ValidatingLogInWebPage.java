package AssignmentonOrangeHRM2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingLogInWebPage {

	public static void main(String[] args) {
		//Automating Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Navigating to Orangehrm url Address
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(applicationUrlAddress);
	
		//Validating Title of Orange HRM
		String expected_OrangeHRMTitle="OrangeHRM";//Should Be
		System.out.println("Expected Title of the OrangeHRM is:-"+expected_OrangeHRMTitle);
		String actual_OrangeHRMTitle="OrangeHRM";//Developer Developed the actual title
		System.out.println("Actual Title of the OrangeHRM is :-"+actual_OrangeHRMTitle);
		if(actual_OrangeHRMTitle.equals(expected_OrangeHRMTitle))
		{
			System.out.println("Title of the OrangeHRM is Matched:-PASS");
			
		}
		else
		{
			System.out.println("Title of the OrangeHRM is NOT Matched:-FAIL");
		}
		
		
		//Validating the Url Address of Orangehrm Should have orangehrm-4.2.0.1
	String expected_orangehrmUrl="orangehrm-4.2.0.1";
	System.out.println("Expected Url Address of the orangehrm is"+expected_orangehrmUrl);
	String actual_orangehrmurl=driver.getCurrentUrl();
	System.out.println("actual Url Address of the orangehrm is"+actual_orangehrmurl);
	if(actual_orangehrmurl.contains(expected_orangehrmUrl))
	{
		System.out.println("Url address of the orangehrm is Matched:-Pass");
	}
	else
	{
		System.out.println("Url address of the orangehrm is NOT Matched:-FAIL");
	}
		//<div id="logInPanelHeading">LOGIN Panel</div>
		By LogInPanelProperty=By.id("logInPanelHeading");
		WebElement LogInPanelText=driver.findElement(LogInPanelProperty);
		LogInPanelText.getSize();
		String LogInPanel_txt=LogInPanelText.getText();
		System.out.println("Text of an element of LogInPanel is:-"+LogInPanel_txt);
		//Validating the LogINPanel Text
	String	expected_LogInpanel="LOGIN Panel";
	System.out.println("Expected login panel of the orangehrm is"+expected_LogInpanel);
	String actual_LogInPanel=LogInPanelText.getText();
	System.out.println("actual loginpanel of the orangehrm is"+actual_LogInPanel);
	if(actual_LogInPanel.equals(expected_LogInpanel))
	{
		System.out.println("The Text of the LogINPanel is Matched :-Pass");
	}
	else
	{
		System.out.println("The Text of the LogINPanel is Matched :-FAIL");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
