package OrangeHRM;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsingOfgetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver;
		driver=new ChromeDriver();
		//Navigating to OrangeHRMHomePage URL Address;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(applicationUrlAddress);

	}

}
