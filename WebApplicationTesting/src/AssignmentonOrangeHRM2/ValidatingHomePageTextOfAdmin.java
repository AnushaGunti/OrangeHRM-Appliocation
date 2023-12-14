package AssignmentonOrangeHRM2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ValidatingHomePageTextOfAdmin {

	public static void main(String[] args) throws InterruptedException {
		//Automate Browser
		WebDriver driver;
				System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\BrowserDriverFiles\\msedgedriver.exe");
		        driver=new EdgeDriver();
		        //Navigating to OrangeHRM app Url Address
		      String applicationUrlAddress= "http://127.0.0.1/orangehrm-4.2.0.1/";
		      driver.get(applicationUrlAddress);
		      //property of an username element
		      //<input name="txtUsername" id="txtUsername" type="text">
		     By UserNameProperty=By.id("txtUsername");
		    WebElement UserName=driver.findElement(UserNameProperty);
		    UserName.sendKeys("Anusha");
		    //property of an userPassword
		    //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		   By UserPasswordProperty=By.id("txtPassword");
		  WebElement UserPassword=driver.findElement(UserPasswordProperty);
		  UserPassword.sendKeys("GuntiAnusha@123");
		  //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By LogInProperty= By.id("btnLogin");
		WebElement LogIn=driver.findElement(LogInProperty);
		LogIn.click();
		
		//Text Should be the Admin
		//property of the element
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
		//id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>t
	  By AdminProperty=By.linkText("Admin");
	WebElement Admin= driver.findElement(AdminProperty);
   String AdminText=Admin.getText();
   System.out.println("Text of the an element of Admin is:-"+AdminText);
	Admin.click();
	String expected_AdminText="Admin";
	System.out.println("The Text of the Admin in Orangehrm is:-"+expected_AdminText);
	String actual_AdminText=Admin.getText();
	System.out.println("The Text of the Admin in orangehrm is :-"+actual_AdminText);
	//Validating the Text of an element of Admin
	if(actual_AdminText.equals(expected_AdminText))
	{
		System.out.println("The Text of an element of Admin is Matched:-Pass");
	}
	else
	{
		System.out.println("The Text of an Element is NOT matched:-FAIL");
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
