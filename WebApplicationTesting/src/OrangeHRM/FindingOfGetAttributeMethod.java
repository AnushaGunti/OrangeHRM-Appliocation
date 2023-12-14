package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingOfGetAttributeMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		String applicationUrlAddress="http://google.com";
		driver.get(applicationUrlAddress);
		/*
		 * <a class="gb_wa gb_gd gb_Id gb_he"
		 *  href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;
		 *  continue=https://www.google.com/&amp;ec=GAZAmgQ" 
		 *  target="_top"><span class="gb_Dd">Sign in</span></a>
		 */
		By SignInProperty=By.linkText("Sign in");
		WebElement SignIn=driver.findElement(SignInProperty);
		String SignIn_Text=SignIn.getText();
		System.out.println("The text of an Element Sign In on the Google HomePage is :- "+SignIn_Text);
		String SignIngetAttribute=SignIn.getAttribute("href");
		System.out.println("The href attribute value of SignIn Element is :- "+SignIngetAttribute);
		String SignIngetAttributeValue=SignIn.getAttribute("class");
		System.out.println("The class attribute value of SignIn Element is :- "+SignIngetAttributeValue);
		SignIn.click();
		driver.quit();
		

	}

}
