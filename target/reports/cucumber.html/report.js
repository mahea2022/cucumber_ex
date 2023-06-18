$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/research/features/colors.feature");
formatter.feature({
  "name": "Change Background Color to Sky Blue",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Change background color to sky blue",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.get(String)\" because \"this.driver\" is null\r\n\tat stepDefinition.StepDefinition.set_SkyBlue_Background_button_exists(StepDefinition.java:34)\r\n\tat ✽.Set SkyBlue Background button exists(file:///C:/Users/amahe/Desktop/QA%20PowerPoint/cucumber_exam/src/test/research/features/colors.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I click on the button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.i_click_on_the_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "status": "skipped"
});
});