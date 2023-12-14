package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingOfLinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\HP\\\\OneDrive\\\\Desktop\\\\ApplicationTesting\\\\WebApplicationTesting\\\\BrowserDriverFiles\\\\chromedriver.exe");
         WebDriver driver;// WebDriver is an interface of the Selenium 
         driver=new ChromeDriver();
        String applicationurlAddress= "http://google.com";
        driver.get(applicationurlAddress);
        /*
          <a class="gb_wa gb_gd gb_Id gb_he" 
          href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ"
           target="_top">
           <span class="gb_Dd">Sign in</span></a>
         */
        /*
        < - tag
        a - tagName - an anchor Tag
        href - attribute
        value - https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;
                 continue=https://www.google.com/&amp;ec=GAZAmgQ
         
          The Type of Element is - link
         locator - linkText
          selector - Sign in
         */
     By  SignInproperty= By.linkText("Sign in");
    WebElement SignIn=driver.findElement(SignInproperty);
    SignIn.click();

        
	}



}
