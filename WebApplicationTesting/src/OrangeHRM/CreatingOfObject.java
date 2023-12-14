package OrangeHRM;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingOfObject {

	public static void main(String[] args) {
		//Automating to Chrome Browser;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
		//we can create a object and write it in two types;
		//one;
		ChromeDriver driver;
		driver=new ChromeDriver();
		//Two
		//ChromeDriver driver=new ChromeDriver();

	}

}
