package Com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/Addingtocart.feature",
		tags = "@TC_04",
		glue = "Com.Definition",
		monochrome = true
		)
public class Iteminstock_runner {

}
