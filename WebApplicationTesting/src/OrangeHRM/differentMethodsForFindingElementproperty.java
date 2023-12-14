package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class differentMethodsForFindingElementproperty {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\HP\\\\OneDrive\\\\Desktop\\\\ApplicationTesting\\\\WebApplicationTesting\\\\BrowserDriverFiles\\\\chromedriver.exe");
        ChromeDriver driver;
        driver=new ChromeDriver();
        String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
        driver.get(applicationUrlAddress);
        //There are 3 types of methods to find the element property;
       /*
        * this are the properties of username,password and login elements
        //<input name="txtUsername" id="txtUsername" type="text">
        //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
        //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
         */
      //1st method of finding Element Property;
        /*
         driver.findElement(By.id("txtUsername")).sendKeys("Anusha");
        driver.findElement(By.name("txtPassword")).sendKeys("GuntiAnusha@123");
        driver.findElement(By.className("button")).click();
        */
        //2nd method of finding Element Property;
       /*
       WebElement UsernameProperty= driver.findElement(By.id("txtUsername"));
       UsernameProperty.sendKeys("Anusha");
       WebElement PasswordProperty=driver.findElement(By.name("txtPassword"));
       PasswordProperty.sendKeys("GuntiAnusha@123");
       WebElement LoginProperty=driver.findElement(By.className("button"));
       LoginProperty.click();
       */
        //3rd method of finding Element;
       By usernameProperty=By.id("txtUsername");
       WebElement Username= driver.findElement(usernameProperty);
       Username.sendKeys("Anusha");
     By PasswordProperty=By.id("txtPassword");
     WebElement Password= driver.findElement(PasswordProperty);
     Password.sendKeys("GuntiAnusha@123");
     By LoginProperty= By.id("btnLogin");
    WebElement Login=driver.findElement(LoginProperty);
    Login.click();
	}

}
