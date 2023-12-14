package ScreenShotCapturing;



	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;


	public class Flipcart_ScreenshotCapturing {

	WebDriver driver;
	String applicationUrlAddress="http://flipkart.com";

	public void applicationLaunch()
	{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\ApplicationTesting\\WebApplicationTesting\\src\\Driver Files\\msedgedriver.exe");
driver=new EdgeDriver();
	driver.get(applicationUrlAddress);
	}

	public void capturingScreenShot() throws IOException
	{

	// 1. pressing the printScreen button of the KeyBoard
	// 2. of the Current WebPage - The screenShot should be captured

	// TakesScreenshot - is interface of the Selenium
	// whenever an interface(TakesScreenshot) is combined with an object(driver) of the Class 
	// - then it is called as TypeCasting

	  // 3. Opening a File(eg:- paint) and pasting the captured screenShot into the File
	// OutputType - is an interface of Selenium
	File bingScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	//  4. the captured ScreenShot now should be save to location of the System
	// 5. when saving the Screenshot - should be provided with the path of the
//	     location of the System with the Name of the file along with format of the image

	FileUtils.copyFile(bingScreenShot, new File("./Screenshots/bing.png"));

	}

	public static void main(String[] args) throws IOException {

	Flipcart_ScreenshotCapturing screenShot = new Flipcart_ScreenshotCapturing();
	screenShot.applicationLaunch();
	screenShot.capturingScreenShot();
	screenShot.applicationClose();

	}

	public void applicationClose()
	{
	driver.quit();
	}


	}

