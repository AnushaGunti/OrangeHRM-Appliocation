package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextmethodfinding {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\HP\\\\OneDrive\\\\Desktop\\\\ApplicationTesting\\\\WebApplicationTesting\\\\BrowserDriverFiles\\\\chromedriver.exe");
        WebDriver driver;// WebDriver is an interface of the Selenium 
        driver=new ChromeDriver();
       String applicationurlAddress= "http://google.com";
       driver.get(applicationurlAddress);
       By  SignInproperty= By.linkText("Sign in");
       WebElement SignIn=driver.findElement(SignInproperty);
       String signIn_Text=SignIn.getText();
       System.out.println(" The text of an Element Sign In on the Google HomePage is :- "+signIn_Text);

       
       SignIn.click();
       driver.quit();
	}

}
