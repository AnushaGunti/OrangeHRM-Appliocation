package No.ofLinksFinding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderBlockLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
	String	orangeHRMURL="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	driver.get(orangeHRMURL);
	//<input name="txtUsername" id="txtUsername" type="text">
	By UserNameProperty=By.id("txtUsername");
WebElement UserName=driver.findElement(UserNameProperty);
		UserName.sendKeys("Anusha");
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	By	PasswordProperty=By.id("txtPassword");
WebElement	Password=driver.findElement(PasswordProperty);
Password.sendKeys("GuntiAnusha@123");
//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
By LogInProperty=By.id("btnLogin");
WebElement LogIn=driver.findElement(LogInProperty);
LogIn.click();
//<div class="menu">
By orangeHRMHeaderBlockProperty=By.className("menu");
WebElement orangeHRMHeaderBlock=driver.findElement(orangeHRMHeaderBlockProperty);

//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/leave/viewLeaveModule" id="menu_leave_viewLeaveModule" class="firstLevelMenu"><b>Leave</b></a>
//a common property to find the no.of links is-anchor tag-'a'
By HeaderBlockLinksProperty=By.tagName("a");
List<WebElement> orangeHRM_HeaderBlockLinks=driver.findElements(HeaderBlockLinksProperty);
int orangeHRM_HomePageLinksCount=orangeHRM_HeaderBlockLinks.size();
System.out.println("The no.of Links on the orangeHRM application HomePage are;-"+orangeHRM_HomePageLinksCount);
for(int index=0;index<orangeHRM_HomePageLinksCount;index++)
{
String 	orangeHRM_HeaderBlockLinkName=orangeHRM_HeaderBlockLinks.get(index).getText();
System.out.println(index+" "+orangeHRM_HeaderBlockLinkName);
orangeHRM_HeaderBlockLinks.get(index).click();
Thread.sleep(5000);
String WebPageTitle=driver.getTitle();
System.out.println(WebPageTitle);
String WebPageCurrentURLAddress=driver.getCurrentUrl();
System.out.println(WebPageCurrentURLAddress);
System.out.println();
driver.navigate().back();
//identifying the HeaderBlock for another Time
orangeHRMHeaderBlock=driver.findElement(orangeHRMHeaderBlockProperty);
//of the header block -finding all the elements and storing back to the ArrayList
//we are creating the arraylist for another time-because when the driver focus shifts to the next page the information stored in the arraylist of the driver will be cleared off
//so create the arraylist to identify the elements of the HeaderBlock for another time after coming back to webpage

orangeHRM_HeaderBlockLinks=orangeHRMHeaderBlock.findElements(orangeHRMHeaderBlockProperty);

}
driver.close();


	}
}