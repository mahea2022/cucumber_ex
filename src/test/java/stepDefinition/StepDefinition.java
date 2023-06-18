package stepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MainPage;

public class StepDefinition extends MainPage{
	
	 WebDriver driver;
	 MainPage mainPage;
	 public void beforeRun() {
			init();
			mainPage= PageFactory.initElements(driver,MainPage.class);
		}
		
     
 	
 	
		
		@Given("Set SkyBlue Background button exists")
		public void set_SkyBlue_Background_button_exists() {
			 driver.get("https://techfios.com/test/106/index.php");
			WebElement button = driver.findElement(By.cssSelector("button[onclick='myFunctionSky()']"));
		
			
			
		}

		@When("I click on the button")
		public void i_click_on_the_button() {
		
			WebElement button = driver.findElement(By.cssSelector("button[onclick='myFunctionSky()']"));
	        button.click();
		}

		@Then("the background color will change to sky blue")
		public void the_background_color_will_change_to_sky_blue() {
			
		}




}
