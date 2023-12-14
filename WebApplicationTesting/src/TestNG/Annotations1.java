package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations1 {
	WebDriver driver;
	String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\src\\Driver Files\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get(ApplicationUrlAddress);
		System.out.println("******ll*********");
	}
	/*@AfterTest
	public void tearDown()
	
	{
		driver.quit();
		System.out.println("******llaa*********");
	}*/
	@Test (priority=1,description="Launching Gmail Application")
	public void gmailApplicationLaunch()
	{
		//<input name="txtUsername" id="txtUsername" type="text">
	By	UserNAmeProperty=By.id("txtUsername");
	WebElement UserName=driver.findElement(UserNAmeProperty);
	UserName.sendKeys("Anusha");
		System.out.println("**********Gmail Application Launched Successfully**********");
		}
	@Test(priority=2,description="Gmail Application LogIn Test")
	public void gmailApplicationLogInTest()
	{
		System.out.println("**********Gmail LogInTest Functionality Test Successfully********");
	}
     @Test(priority=3,description="Gmail Application Inbox Test")
     public void gmailApplicationInBoxTest()
     {
    	 System.out.println("*****GmailAppication InBox Functionality Test Successfully********");
    	 
     }
     @Test(priority=4,description="GmailApplication ComposeMail Test")
     public void gmailApplicationComposeMailTest()
     {
    	 System.out.println("********GmailApplication ComposeMail Functionality Test********");
     }
     @Test(enabled=false,description="GmailApplication Drafts Mail Test")
     public void gmailApplicationDraftsMailTest()
     {
    	 System.out.println("*********GmailApplication DraftSMAil Test");
     }
     @Test(priority=6,description="GmailApplication SentMAil Test")
     public void gmailApplicationSentMAilTest()
     {
    	 System.out.println("******GmailApplication Sent MAil Test Functionality Successfull");
     }
   
}
