package Com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingGoogleHomePageTitle {

	public static void main(String[] args) {
	     //Automating to Chrome Browser;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//Navigating to GoogleHomePage
		String applicationurladdress="http://google.com";
		driver.get(applicationurladdress);
		//Expected Title of the GoogleHomepage-Client Requirement;
		String expected_GoogleHomePageTitle="Google";
		System.out.println("Expected tiltle of the GoogleHomePage is:-"+expected_GoogleHomePageTitle);
		
		//Actual Title of the GoogleHomePage-Developer developed the GoogleHomePage Title;
		String actual_GoogleHomePageTitle=driver.getTitle();
		
		//Validating the Title of the GoogleHomePage;
		if(actual_GoogleHomePageTitle.equals(expected_GoogleHomePageTitle)) 
		{
			System.out.println("Title of the GooglehomePage Matched is:-Pass");
		}
		else
		{
			System.out.println("Title of the GoogleHomePage NOT Matched is :-Fail");
		}
		driver.quit();
	}
}


	


