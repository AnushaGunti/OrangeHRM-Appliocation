package com.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class AmazonTest {
	public static WebDriver driver;
	@Given("User should open the Amazon Browser")
	public void user_should_open_the_amazon_browser() {
		 System.setProperty("webdriver.chrome.driver", "./New Driver Files/chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.get("https://www.amazon.in/");
	      driver.manage().window().maximize();
	      }
}
