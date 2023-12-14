package photoidentity;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class photo {
	WebDriver driver;
	String appurl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\src\\Driver Files\\msedgedriver.exe");
		System.out.println("****Edge Browser Launched Successfully*********");
		driver=new EdgeDriver();
		driver.get(appurl);
	
	}
	@Test(priority=1,description="Photo validation")
	public void photo() throws InterruptedException, IOException
	{
		//need login in OrangeHRM;
				//So need find the Properties of the Login or find the elements need to login;
				//<input name="txtUsername" id="txtUsername" type="text">;
		        driver.findElement(By.id("txtUsername")).sendKeys("Anusha");
		      //  <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">;
		        driver.findElement(By.id("txtPassword")).sendKeys("GuntiAnusha@123");
				//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
				driver.findElement(By.id("btnLogin")).click();
				By PIMProperty=By.linkText("PIM");
				WebElement PIM=driver.findElement(PIMProperty);
		        Actions actions =new Actions(driver);
		        actions.moveToElement(PIM).build().perform();
		        By	AddEmployeeProperty=By.linkText("Add Employee");
		     	WebElement AddEmployee=driver.findElement(AddEmployeeProperty);
		     	AddEmployee.click();
		     	By FirstNameProperty=By.name("firstName");
		        WebElement FirstName= driver.findElement(FirstNameProperty);	
		       FirstName.sendKeys("Anushahjj");
		       By MiddleNameProperty=By.name("middleName");
		       WebElement MiddleName=driver.findElement(MiddleNameProperty);
		       MiddleName.sendKeys("Anujh");
		       By LastNameProperty=By.id("lastName");
		       WebElement LastName=driver.findElement(LastNameProperty);
		       LastName.sendKeys("abcdef");
		     //Shifting the focus from LastName to EmployeeID
		   	Actions keyboardActions=new Actions(driver);
		  //Shifting the focus from EmployeeID to ChooseFile
		   	keyboardActions.sendKeys(Keys.TAB).build().perform();
			keyboardActions.sendKeys(Keys.TAB).build().perform();
		   	keyboardActions.sendKeys(Keys.ENTER).build().perform();
		   	
		   	Thread.sleep(20000);
		   	java.lang.Runtime.getRuntime().exec("C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\Autoit\\autoitpi.exe");
		   	
		   	By SaveButtonproperty=By.id("btnSave");
		    WebElement SaveButton=driver.findElement(SaveButtonproperty);
		    SaveButton.click();
		    
		    

	}

}
