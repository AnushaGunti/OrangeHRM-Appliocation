package No.ofLinksFinding;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingnumberofLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
       String AppUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
       driver.get(AppUrl);
      By LinksProperty=By.tagName("a");
      List <WebElement> orangeHRM_HomePageLinks=driver.findElements(LinksProperty);
      int orangeHRM_HomePageLinkscount=orangeHRM_HomePageLinks.size();
      System.out.println("The no.of Links on the OrangeHRM app HomePage are:-"+orangeHRM_HomePageLinkscount);
      for(int index=0;index<orangeHRM_HomePageLinkscount;index++)
      {
    	  String orangeHRM_HomePageLinkName =orangeHRM_HomePageLinks.get(index).getText();
    	  System.out.println(index +" "+orangeHRM_HomePageLinkName);
      }
      driver.quit();
	}

}
