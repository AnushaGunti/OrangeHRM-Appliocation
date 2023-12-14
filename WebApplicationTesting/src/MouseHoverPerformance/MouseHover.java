package MouseHoverPerformance;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;





public class MouseHover {
WebDriver driver;
String ApplicationURL="https://www.amazon.com/";
public void applicationLaunch()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(ApplicationURL);
	System.out.println("****Browse launched successfully into amazon application");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
//Hello signin Element -Which is a mouseHover operation
public void hellosignin()
{
	//<span id="nav-link-accountList-nav-line-1" class="nav-line-1 nav-progressive-content">Hello, sign in</span>
	By HellosignInProperty=By.id("nav-link-accountList-nav-line-1");
	WebElement HellosignIn=driver.findElement(HellosignInProperty);
	//HelloSignIn is a Hidden Element so we use mouse Hover operation 
	//Actions is a class to the mouseHover
	Actions hellosigninMouseHover=new Actions(driver);
	hellosigninMouseHover.moveToElement(HellosignIn).build().perform();
}
public void watchList()
{
	//<span class="nav-text">Watchlist</span>
	By WatchListProperty=By.className("nav-text");
	WebElement WatchList=driver.findElement(WatchListProperty);
	WatchList.click();
String	WatchListWebPage=driver.getTitle();
System.out.println("Title of the WAtchList WebPAGE is:- "+WatchListWebPage);
}
public void close()
{
	driver.quit();
}

	public static void main(String[] args) {
		MouseHover amazon=new MouseHover();
		amazon.applicationLaunch();
		amazon.hellosignin();
		amazon.watchList();
		amazon.close();
		
		

	}

}
