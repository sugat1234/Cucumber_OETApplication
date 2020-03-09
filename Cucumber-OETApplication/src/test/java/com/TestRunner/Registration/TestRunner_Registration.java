package com.TestRunner.Registration;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.cucumber.*;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions
(
	features="C:\\Users\\sugat\\eclipse-workspace\\Cucumber-OETApplication\\src\\test\\java\\com\\Feature\\Registration",
	
	glue="com.StepDefinition.Registration",
	
	monochrome = true,
	
	plugin= {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json",
			 "junit:target/cucumber-reports/Cucumber.xml"},
	
	stepNotifications = true,
	
	tags= {"@Sample"}
)

public class TestRunner_Registration 
{ 

}
