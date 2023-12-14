package com.StepDefination;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Amazon.feature",
glue="com.StepDefination")

public class AmazonTestrunner 
{

}
