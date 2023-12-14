package AssignmentonOrangeHRM2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PIMOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\HP\\\\OneDrive\\\\Desktop\\\\ApplicationTesting\\\\WebApplicationTesting\\\\src\\\\Driver Files\\\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/";
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
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule"
	//id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
	By PIMProperty=By.linkText("PIM");
	WebElement PIM=driver.findElement(PIMProperty);
	PIM.click();
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" 
	//id="menu_pim_addEmployee">Add Employee</a>
   By AddEmployeeProperty= By.id("menu_pim_addEmployee");
  WebElement AddEmployee=driver.findElement(AddEmployeeProperty);
  AddEmployee.click();
	}

}
