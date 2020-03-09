$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/Feature/Registration/Registeration.feature");
formatter.feature({
  "name": "Registeration of OET",
  "description": "This feature involves registeration a user for OET.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Registration"
    }
  ]
});
formatter.background({
  "name": "User navigates to Registeration page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "\u0027Given Name\u0027 is mandatory for registration",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Registration"
    },
    {
      "name": "@Functional"
    },
    {
      "name": "@Sample"
    }
  ]
});
formatter.step({
  "name": "I am on Register page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepDefinition.Registration.StepDefinition_Registeration.i_am_on_Register_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I keep field Given Name blank",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Registration.StepDefinition_Registeration.i_keep_field_Given_Name_blank()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter all other details",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Registration.StepDefinition_Registeration.i_enter_all_other_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Next",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Registration.StepDefinition_Registeration.i_click_on_Next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get valid error message for Given Name",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Registration.StepDefinition_Registeration.i_get_valid_error_message_for_Given_Name()"
});
formatter.result({
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Required]\u003e but was:\u003c[]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat com.StepDefinition.Registration.StepDefinition_Registeration.i_get_valid_error_message_for_Given_Name(StepDefinition_Registeration.java:56)\r\n\tat ✽.I get valid error message for Given Name(file:///C:/Users/sugat/eclipse-workspace/Cucumber-OETApplication/src/test/java/com/Feature/Registration/Registeration.feature:14)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});