package AssignmentOnOrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingLogInWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(applicationUrlAddress);
		String OrangeHRMurlAdd="OrangeHRM-4.2.0.1";
		System.out.println("UrlAddress of OrangeHRM is having with:-"+OrangeHRMurlAdd);
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
		//<div id="logInPanelHeading">LOGIN Panel</div>
		By LogInPanelProperty=By.id("logInPanelHeading");
		WebElement LogInPanelText=driver.findElement(LogInPanelProperty);
		LogInPanelText.getSize();
		String LogInPanel_txt=LogInPanelText.getText();
		System.out.println("Text of an element of LogInPanel is:-"+LogInPanel_txt);
	}

}
