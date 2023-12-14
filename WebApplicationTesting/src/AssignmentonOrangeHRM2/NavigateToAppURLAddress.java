package AssignmentonOrangeHRM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAppURLAddress {

	public static void main(String[] args) {
		//Automating to Browser
     System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\OneDrive\\\\Desktop\\\\ApplicationTesting\\\\WebApplicationTesting\\\\BrowserDriverFiles\\\\chromedriver.exe");
     WebDriver driver;
     driver=new ChromeDriver();
     //Naavigating to App Url Add
    String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/";
    driver.get(applicationUrlAddress);
     

	}

}
