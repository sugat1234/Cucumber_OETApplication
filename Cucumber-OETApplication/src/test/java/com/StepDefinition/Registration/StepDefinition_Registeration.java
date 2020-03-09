package com.StepDefinition.Registration;

import org.openqa.selenium.By;

import com.Pages.OET_Registration;
import com.Utilities.OET_ExtentReport;
import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class StepDefinition_Registeration 
{
	OET_Registration application;
	String errorMessage;

	@Before
	public void setup()
	{	
		application=new OET_Registration();
		
		application.launchApplication();
	}
	
	@Given("I am on Register page")
	public void i_am_on_Register_page() 
	{
		application.navigateToRegisterationPage();	
	}

	@When("I click on Next")
	public void i_click_on_Next() 
	{
		application.clickNext();
	}
	
	@Given("I enter all other details")
	public void i_enter_all_other_details() 
	{
		
	}
	
	@Given("I keep field Given Name blank")
	public void i_keep_field_Given_Name_blank() 
	{
		application.fillRegisterationDetails(1);
	}

	@Then("I get valid error message for Given Name")
	public void i_get_valid_error_message_for_Given_Name() 
	{
		errorMessage=application.driver.findElement(By.xpath("//div[@id='firstnameErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	}

	@Given("I keep field Family Name blank")
	public void i_keep_field_Family_Name_blank() 
	{
		application.fillRegisterationDetails(2);
	}

	@Then("I get valid error message for Family Name")
	public void i_get_valid_error_message_for_Family_Name() 
	{
		errorMessage=application.driver.findElement(By.xpath("//div[@id='lastnameErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	}

	@Given("I do not select value in dropdown Gender")
	public void i_do_not_select_value_in_dropdown_Gender() 
	{
		application.fillRegisterationDetails(3);
	}

	@Then("I get valid error message for Gender")
	public void i_get_valid_error_message_for_Gender() 
	{
		errorMessage=application.driver.findElement(By.xpath("//div[@id='genderErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	
	}

	@Given("I do not select value in field Date of Birth")
	public void i_do_not_select_value_in_field_Date_of_Birth() 
	{
		application.fillRegisterationDetails(4);
	}

	@Then("I get valid error message for Date of Birth")
	public void i_get_valid_error_message_for_Date_of_Birth() 
	{
		errorMessage=application.driver.findElement(By.xpath("//div[@id='dobErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	}

	@Given("I keep field Profession blank")
	public void i_keep_field_Profession_blank() 
	{
		application.fillRegisterationDetails(5);
	}

	@Then("I get valid error message for Profession")
	public void i_get_valid_error_message_for_Profession() 
	{
		errorMessage=application.driver.findElement(By.xpath("//div[@id='professionErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	}

	@Given("I keep field Address blank")
	public void i_keep_field_Address_blank() 
	{
		application.fillRegisterationDetails(6);
	}

	@Then("I get valid error message for Address")
	public void i_get_valid_error_message_for_Address() 
	{
		errorMessage=application.driver.findElement(By.xpath("//div[@id='addressErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	}

	@Given("I keep field City blank")
	public void i_keep_field_City_blank() 
	{
		application.fillRegisterationDetails(7);
	}

	@Then("I get valid error message for City")
	public void i_get_valid_error_message_for_City() 
	{
		errorMessage=application.driver.findElement(By.xpath("//div[@id='cityErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	}

	@Given("I do not select value in dropdown Country\\/Territory")
	public void i_do_not_select_value_in_dropdown_Country_Territory() 
	{
		application.fillRegisterationDetails(8);
	}

	@Then("I get valid error message for Country\\/Territory")
	public void i_get_valid_error_message_for_Country_Territory() 
	{
		errorMessage=application.driver.findElement(By.xpath("//div[@id='countryErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	}

	@Given("I keep field Contact Number Country Code blank")
	public void i_keep_field_Contact_Number_Country_Code_blank() 
	{
		application.fillRegisterationDetails(9);
	}

	@Then("I get valid error message for Contact Number Country Code")
	public void i_get_valid_error_message_for_Contact_Number_Country_Code() 
	{
		errorMessage=application.driver.findElement(By.xpath("//div[@id='contactNumberErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	}

	@Given("I keep field Contact Number Area Code blank")
	public void i_keep_field_Contact_Number_Area_Code_blank() 
	{
		application.fillRegisterationDetails(10);
	}

	@Then("I get valid error message for Contact Number Area Code")
	public void i_get_valid_error_message_for_Contact_Number_Area_Code() 
	{
		errorMessage=application.driver.findElement(By.xpath("//div[@id='contactNumberErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	}

	@Given("I keep field Contact Number Phone Number blank")
	public void i_keep_field_Contact_Number_Phone_Number_blank() 
	{
		application.fillRegisterationDetails(11);
	}

	@Then("I get valid error message for Contact Number Phone Number")
	public void i_get_valid_error_message_for_Contact_Number_Phone_Number() 
	{
		errorMessage=application.driver.findElement(By.xpath("//div[@id='contactNumberErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	}

	@Given("I do not select value in dropdown ID Type")
	public void i_do_not_select_value_in_dropdown_ID_Type() 
	{
		application.fillRegisterationDetails(12);
	}

	@Then("I get valid error message for ID Type")
	public void i_get_valid_error_message_for_ID_Type() 
	{
		errorMessage=application.driver.findElement(By.xpath("//div[@id='idTypeErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	}

	@Given("I keep field ID Number blank")
	public void i_keep_field_ID_Number_blank() 
	{
		application.fillRegisterationDetails(13);
	}

	@Then("I get valid error message for ID Number")
	public void i_get_valid_error_message_for_ID_Number() 
	{
		errorMessage=application.driver.findElement(By.xpath("//div[@id='idNumberErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	}

	@Given("I do not select value in dropdown Nationality")
	public void i_do_not_select_value_in_dropdown_Nationality() 
	{
		application.fillRegisterationDetails(14);
	}

	@Then("I get valid error message for Nationality")
	public void i_get_valid_error_message_for_Nationality() {
		errorMessage=application.driver.findElement(By.xpath("//div[@id='nationalityErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	}

	@Given("I do not select value in dropdown First Language")
	public void i_do_not_select_value_in_dropdown_First_Language() 
	{
		application.fillRegisterationDetails(15);
	}

	@Then("I get valid error message for First Language")
	public void i_get_valid_error_message_for_First_Language() 
	{
		errorMessage=application.driver.findElement(By.xpath("//div[@id='firstLanguageErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	}

	@Given("I keep field Email blank")
	public void i_keep_field_Email_blank() 
	{
		application.fillRegisterationDetails(16);
	}

	@Then("I get valid error message for Email")
	public void i_get_valid_error_message_for_Email() 
	{
		errorMessage=application.driver.findElement(By.xpath("//div[@id='emailErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	}

	@Given("I keep field Confirm Email blank")
	public void i_keep_field_Confirm_Email_blank() 
	{
		application.fillRegisterationDetails(17);
	}

	

	@Then("I get valid error message for Confirm Email")
	public void i_get_valid_error_message_for_Confirm_Email() 
	{
		errorMessage=application.driver.findElement(By.xpath("//div[@id='confirmemailErr']")).getAttribute("innerHTML");
		
		Assert.assertEquals("Required", errorMessage);
	}

	@After
	public void closeBrowser()
	{
		//application.driver.close();
	}
}
