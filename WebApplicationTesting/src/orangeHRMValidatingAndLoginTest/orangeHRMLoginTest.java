package orangeHRMValidatingAndLoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHRMLoginTest {

	public static void main(String[] args) {
		//Automating to chrome browser;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Navigating to orangeHRMHomePage;
		String appicationurladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(appicationurladdress);
		//Expected Title of the OrangeHRMHomePage -Client Requirement;
		String expected_OrangeHRMHomePageTitle="OrangeHRM";
		System.out.println("Expected Title of the OrangeHRM is:- "+expected_OrangeHRMHomePageTitle);
		//Actual Title of the OrangeHRMHomePage -Developer developed the title;
		String actual_OrangeHRMHomePageTitle=driver.getTitle();
		System.out.println("Actual Title of the OrangeHRM is:- "+actual_OrangeHRMHomePageTitle);
		//Validating the Title of the OrangeHRMHomePage;
		if(actual_OrangeHRMHomePageTitle.equals(expected_OrangeHRMHomePageTitle))
		{
			System.out.println("Title of the OrangeHRMHomePage is Matched:-PASS");
		}
		else
		{
			System.out.println("Title of the OrangeHRMHomePage is Matched:-FAIL");
		}
		//need login in OrangeHRM;
		//So need find the Properties of the Login or find the elements need to login;
		//<input name="txtUsername" id="txtUsername" type="text">;
        driver.findElement(By.id("txtUsername")).sendKeys("Anusha");
      //  <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">;
        driver.findElement(By.id("txtPassword")).sendKeys("GuntiAnusha@123");
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();

	}

}
