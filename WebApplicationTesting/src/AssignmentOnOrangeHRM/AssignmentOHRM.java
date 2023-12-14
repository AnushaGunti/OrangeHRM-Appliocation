package AssignmentOnOrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOHRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		String applicationurladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
        driver.get(applicationurladdress);
      String expected_OrangeHRMHomePageTitle= "OrangeHRM";
      System.out.println("Expected Title of the OrangeHRM is:-"+expected_OrangeHRMHomePageTitle);
      String actual_OrangeHRMHomePageTitle="OrangeHRM";
      System.out.println("Expected Title of the OrangeHRM is:-"+actual_OrangeHRMHomePageTitle);
      driver.getTitle();
      //<div id="logInPanelHeading">LOGIN Panel</div>
      By LogInPanel=By.id("logInPanelHeading");
     WebElement LogInPanelTest= driver.findElement(LogInPanel);
     LogInPanelTest.getText();
     System.out.println("The text of an Element LogInPanel on the OrangeHRMHomePage is:-"+LogInPanelTest);
      
      if(actual_OrangeHRMHomePageTitle.equals(expected_OrangeHRMHomePageTitle))
      {
    	  System.out.println("Title of the OrangeHrmHomePage Matched:- PASS");
      }
      else
      {
    	  System.out.println("Title of the OrangeHRMHomePage NOT Matched:-FAIL");
      }
      /*
    <div id="logInPanelHeading">LOGIN Panel</div>
       */
      //<input name="txtUsername" id="txtUsername" type="text">
      By usernameproperty= By.id("txtUsername");
      WebElement username= driver.findElement(usernameproperty);
      username .sendKeys("Anusha");
      //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
     By UserPasswordProperty= By.id("txtPassword");
     WebElement UserPassword=driver.findElement(UserPasswordProperty);
     UserPassword.sendKeys("GuntiAnusha@123");
    //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
    By LogIn= By.id("btnLogin");
   WebElement LogInTest=driver.findElement(LogIn);
   LogInTest.click();
    //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
   //id="menu_admin_viewAdminModule" 
   //class="firstLevelMenu"><b>Admin</b></a>
    By Admin= By.className("firstLevelMenu");
    WebElement AdminText=driver.findElement(Admin);
    AdminText.getText();
    System.out.println("The text of an Element AdminText on the OrangeHRMHomePage is:-"+AdminText);
    AdminText.click();
    //<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
  By WelComeAdmin= By.linkText("Welcome Admin");
  WebElement WelComeAdminTest=driver.findElement(WelComeAdmin);
  WelComeAdminTest.click();
    //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
   By Logout=By.linkText("Logout");
 WebElement LogoutTest= driver.findElement(Logout);
 LogoutTest.click();
    
    
    
    
    
    
    
    
    
    
    
    
     
     
     
     
     
     
   
	}

}
