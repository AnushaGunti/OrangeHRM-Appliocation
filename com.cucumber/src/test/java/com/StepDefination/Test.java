package com.StepDefination;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./OrangeHRM.feature",
glue="./New Driver Files/chromedriver.exe")

public class Test 
{

}
