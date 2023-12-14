package Com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestingBrowser {

	public static void main(String[] args) {
		//Automating to Browser Launch
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver117/chromedriver.exe");
         ChromeDriver driver=new ChromeDriver();
         //Navigating BingHomePage;
        String applicationurlAddress="http://bing.com";
        driver.get(applicationurlAddress);
        //Expected BingHomePage Title-Client Requirement;
        String expected_BingHomePageTitle="Bing";
        System.out.println("The Expected Title of the BingHomePage is:-"+expected_BingHomePageTitle);
        //Actual BingHomePage Title-Developer developed title of the BingHomePage;
        String actual_BingHomePageTitle=driver.getTitle();
        System.out.println("The Actual Title of the Bing HomePage Is:-"+actual_BingHomePageTitle);
        //validating the title of the BingHomePage;
        if(actual_BingHomePageTitle.equals(expected_BingHomePageTitle))
        {
        	System.out.println("Title of the BingHomaPage is Matched :-PASS");
        	
        }
        else
        {
        	System.out.println("Title of the BingHomePage Not Matched:-FAIL");
        }
        driver.close();
	}

}
