package MouseHoverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
        driver=new ChromeDriver();
       String  applicationUrlAdd="https://www.amazon.in";
       driver.get(applicationUrlAdd);
       //id="nav-link-accountList"
     By helloSignInProperty= By.id("nav-link-accountList");
    WebElement helloSignIn=driver.findElement(helloSignInProperty);
    Actions action=new Actions(driver);
    action.moveToElement(helloSignIn).build().perform();
    //<a id="nav_prefetch_yourorders"
   // href="/gp/css/order-history?ref_=nav_AccountFlyout_orders" 
    		//class="nav-link nav-item"><span class="nav-text">Your Orders</span></a>
    By yourOrdersProperty=By.linkText("Your Orders");
    WebElement yourorders=driver.findElement(yourOrdersProperty);
    		
    yourorders.click();
    System.out.println(driver.getTitle());
    driver.quit();
	}

}
