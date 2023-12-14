package AssignmentonOrangeHRM2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInToAPPWithValidTestData {

	public static void main(String[] args) {
		//Automate Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
        WebDriver driver;
        driver=new ChromeDriver();
        //Navigating to OrangeHRM app Url Address
      String applicationUrlAddress= "http://127.0.0.1/orangehrm-4.2.0.1/";
      driver.get(applicationUrlAddress);
      //<input name="txtUsername" id="txtUsername" type="text">
     By UserNameProperty=By.id("txtUsername");
    WebElement UserName=driver.findElement(UserNameProperty);
    UserName.sendKeys("Anusha");
    //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
   By UserPasswordProperty=By.id("txtPassword");
  WebElement UserPassword=driver.findElement(UserPasswordProperty);
  UserPassword.sendKeys("GuntiAnusha@123");
  //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
By LogInProperty= By.id("btnLogin");
WebElement LogIn=driver.findElement(LogInProperty);
LogIn.click();
	}

}
