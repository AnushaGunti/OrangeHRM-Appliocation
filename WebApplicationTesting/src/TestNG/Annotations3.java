package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 {
	@BeforeMethod (description="Launching Gmail Application")
	public void gmailApplicationLaunch()
	{
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
     @AfterMethod(description="GmailApplication Close Test")
     public void gmailApplicationClose()
     {
    	 System.out.println("******GmailApplication CLose Functionality Test*********");
     }
   



}

