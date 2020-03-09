
@Registration
Feature: Registeration of OET
This feature involves registeration a user for OET.

Background: User navigates to Registeration page

	@Functional  @Sample
	Scenario: 'Given Name' is mandatory for registration	
	  Given I am on Register page
	  And I keep field Given Name blank
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for Given Name
	
	@Functional 
	Scenario: 'Family Name' is mandatory for registration	
	  Given I am on Register page
	  And I keep field Family Name blank 
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for Family Name
	  
	@Functional
	  Scenario: 'Gender' is mandatory for registration	
	  Given I am on Register page
	  And I do not select value in dropdown Gender
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for Gender
	
	@Functional
	  Scenario: 'Date of Birth' is mandatory for registration	
	  Given I am on Register page
	  And I do not select value in field Date of Birth
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for Date of Birth
	
	@Functional  
	  Scenario: 'Profession' is mandatory for registration	
	  Given I am on Register page
	  And I keep field Profession blank
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for Profession
	 
	 @Functional   
	  Scenario: 'Address' is mandatory for registration	
	  Given I am on Register page
	  And I keep field Address blank
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for Address

	@Functional	  
	  Scenario: 'City' is mandatory for registration	
	  Given I am on Register page
	  And I keep field City blank
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for City
	
	@Functional
	  Scenario: 'Country/Territory' is mandatory for registration	
	  Given I am on Register page
	  And I do not select value in dropdown Country/Territory
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for Country/Territory
	
	@Functional  
	  Scenario: 'Contact Number Country Code' is mandatory for registration	
	  Given I am on Register page
	  And I keep field Contact Number Country Code blank
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for Contact Number Country Code

	@Functional	  
	  Scenario: 'Contact Number Area Code' is mandatory for registration	
	  Given I am on Register page
	  And I keep field Contact Number Area Code blank
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for Contact Number Area Code
	
	@Functional  
	  Scenario: 'Contact Number Phone Number' is mandatory for registration	
	  Given I am on Register page
	  And I keep field Contact Number Phone Number blank
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for Contact Number Phone Number
	
	@Functional  
	  Scenario: 'ID Type' is mandatory for registration	
	  Given I am on Register page
	  And I do not select value in dropdown ID Type
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for ID Type
	
	@Functional  
	  Scenario: 'ID Number' is mandatory for registration	
	  Given I am on Register page
	  And I keep field ID Number blank
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for ID Number
	
	@Functional  
	  Scenario: 'Nationality' is mandatory for registration	
	  Given I am on Register page
	  And I do not select value in dropdown Nationality
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for Nationality
	
	@Functional  
	  Scenario: 'First Language' is mandatory for registration	
	  Given I am on Register page
	  And I do not select value in dropdown First Language
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for First Language
	
	@Functional  
	  Scenario: 'Email' is mandatory for registration	
	  Given I am on Register page
	  And I keep field Email blank
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for Email
	
	@Functional  
	  Scenario: 'Confirm Email' is mandatory for registration	
	  Given I am on Register page
	  And I keep field Confirm Email blank
	  And I enter all other details
	  When I click on Next
	  Then I get valid error message for Confirm Email
