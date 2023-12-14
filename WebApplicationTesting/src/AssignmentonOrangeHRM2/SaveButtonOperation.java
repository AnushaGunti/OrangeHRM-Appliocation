package AssignmentonOrangeHRM2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaveButtonOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
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
  //properties of element firstname
  //<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
 By FirstName1Property=By.id("firstName");
WebElement FirstName1=driver.findElement(FirstName1Property);
String FN1=FirstName1.getText();
System.out.println("The text of the Firstname is:-"+FN1);
FirstName1.sendKeys("Anusha");
//properties of element middle name
//<input class="formInputText" max length="30" type="text" name="middleName" id="middleName">
By MiddleNameProperty=By.id("middleName");
WebElement MiddleName=driver.findElement(MiddleNameProperty);
MiddleName.sendKeys("Netha");
//property of an element LastName
//<input class="formInputText" max length="30" type="text" name="lastName" id="lastName">
By LastNameProperty=By.id("lastName");
WebElement LastName=driver.findElement(LastNameProperty);
LastName.sendKeys("Gunti");
//Property of An Element SaveButton
//<input type="button" class="" id="btnSave" value="Save">
By SaveProperty=By.id("btnSave");
WebElement Save=driver.findElement(SaveProperty);
Save.click();
//<input value="Anusha" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">



















	}
}





































	


