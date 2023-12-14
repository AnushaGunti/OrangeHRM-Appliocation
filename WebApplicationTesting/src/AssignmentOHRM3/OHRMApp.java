package AssignmentOHRM3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OHRMApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
         ChromeDriver driver=new ChromeDriver();
        String AppUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
        driver.get(AppUrl);
     String  ExpectedOrangeHRMHomePageTitle= "OrangeHRM";
     System.out.println("The Expected title of the OrangeHRM :-"+ExpectedOrangeHRMHomePageTitle);
     String ActualOrangeHRMHomePageTitle=driver.getTitle();
     System.out.println("The Actual title of the OrangeHRM :-"+ActualOrangeHRMHomePageTitle);
     if(ActualOrangeHRMHomePageTitle.equals(ExpectedOrangeHRMHomePageTitle))
     {
    	 System.out.println("The Title of the OrangeHRM HomePage is matched :-PASS");
     }
     else
     {
    	 System.out.println("The Title of the OrangeHRM HomePage is NOT matched:-FAIL");
     }
   String ExpectedURL= "orangehrm-4.2.0.1";
   System.out.println("The expected URL of the OHRM :-"+ExpectedURL);
   String ActualURL=driver.getCurrentUrl();
   System.out.println("The Actual URL of the OHRM:-"+ActualURL);
   if(ActualURL.equals(ExpectedURL))
   {
	   System.out.println("The Url of the OHRM is Matched:-PASS");
   } 
   else
	   {
		   System.out.println("The Url of the OHRM is NOT Matched:-FAIL");
	   }
   //<div id="logInPanelHeading">LOGIN Panel</div>
  By LogInPannelProperty=By.id("logInPanelHeading");
 WebElement LogInPanel=driver.findElement(LogInPannelProperty);
 LogInPanel.getSize();
String LogInPanel_Text= LogInPanel.getText();
System.out.println("Text of the LogInPanel is:-"+LogInPanel_Text);
   String  ExpectedText="LOGIN Panel";
   System.out.println("The text of the Loginpanel is:-"+ExpectedText);
  String ActualText=LogInPanel.getText();
  System.out.println("The text of the Loginpanel is:-"+LogInPanel_Text);
  if(ActualText.equals(ExpectedText))
  {
	  System.out.println("Pass");
  }
  else
  {
	  System.out.println("Fail");  
  }
  //<input name="txtUsername" id="txtUsername" type="text">
 By UserNameProperty=By.id("txtUsername");
WebElement UserName=driver.findElement(UserNameProperty);
UserName.sendKeys("Anusha");
//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
By UserPasswordProperty=By. id("txtPassword");  
WebElement UserPassword=driver.findElement(UserPasswordProperty);
UserPassword.sendKeys("GuntiAnusha@123");
//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
By LogInProperty=By.id("btnLogin");
WebElement LogIn=driver.findElement(LogInProperty);
LogIn.click();

//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
By AdminTextProperty=By.linkText("Admin");
WebElement AdminText=driver.findElement(AdminTextProperty);
String Admin=AdminText.getText();
System.out.println("The Text of the Admin:-"+Admin);
String ExpectedAdminText="Admin";
System.out.println("The text of the Admin "+ExpectedAdminText);
String ActualAdminText=AdminText.getText();
if(ActualAdminText.equals(ExpectedAdminText))
{
	System.out.println("Pass");
	
}
else
{
	System.out.println("Fail");	
}
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
By PIMProperty=By.linkText("PIM");
WebElement PIM=driver.findElement(PIMProperty);
PIM.click();
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
By AddEmployeePropert=By.linkText("Add Employee");
WebElement AddEmployee=driver.findElement(AddEmployeePropert);
AddEmployee.click();
//<label class="hasTopFieldHelp">Full Name</label>
By FullNameProperty=By.className("hasTopFieldHelp");
WebElement FullName=driver.findElement(FullNameProperty);
String FullNameText=FullName.getText();
System.out.println("Expected Text of the fullname :-"+FullNameText);
//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
By FirstNameProperty=By.id("firstName");
WebElement FirstName=driver.findElement(FirstNameProperty);
FirstName.sendKeys("Anusha");
//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
By MiddleNameProperty=By.id("middleName");
WebElement MiddleName=driver.findElement(MiddleNameProperty);
MiddleName.sendKeys("Netha");

//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
By LastnameProperty=By.id("lastName");
WebElement LastName=driver.findElement(LastnameProperty);
LastName.sendKeys("Gunti");
//<input type="button" class="" id="btnSave" value="Save">..
By SaveProperty=By.id("btnSave");
WebElement Save=driver.findElement(SaveProperty);
Save.click();
//<label for="Full_Name" class="hasTopFieldHelp">Full Name</label>
By PersonalFullNameProperty=By.className("hasTopFieldHelp");
WebElement PersonalFullName=driver.findElement(PersonalFullNameProperty);
PersonalFullName.getText();
System.out.println("The Text of the Personal Details fullname"+PersonalFullName);
String ExpectedFullNameText="Full Name";
System.out.println("The Expected Text of the Personal Details fullname"+ExpectedFullNameText);
String ActualFullNameText=PersonalFullName.getText();
System.out.println("The Actual Text of the Personal Datails Fullname"+ActualFullNameText);
if(ActualFullNameText.equals(ExpectedFullNameText))
{
	System.out.println("PASS");
}
else
{
	System.out.println("FAIL");
}
//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
By welcomeAdminProperty=By.id("welcome");
WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
welcomeAdmin.click();
Thread.sleep(3000);

//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
By LogoutProperty=By.linkText("Logout");
WebElement Logout=driver.findElement(LogoutProperty);
Logout.click();
String ExpectedTitle="OrangeHRM";
System.out.println("the title of the ohrm "+ExpectedTitle);
String ActualTitle=driver.getTitle();
System.out.println("The Actual title of the ohrm "+ActualTitle);
if(ActualTitle.equals(ExpectedTitle))
{
	System.out.println("P");
}
else
{
	System.out.println("F");
}
driver.quit();

















	}

}
