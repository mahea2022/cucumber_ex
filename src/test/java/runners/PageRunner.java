package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\research\\features\\colors.feature",
		glue="stepDefinition",
		monochrome = true,
		dryRun = false,
		plugin = {
			//	"pretty",
				"html:target/reports/cucumber.html",
				"json:target/reports/cucumer.json"
		}
		)


public class PageRunner {

}
