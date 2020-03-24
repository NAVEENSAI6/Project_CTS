package Com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/Addingtocart.feature",
		tags = "@TC_03",
		glue = "Com.Definition",
		monochrome = true
		)
public class Proceedcheck_runner {

}
