package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\Josep\\eclipse-workspace\\Office\\src\\test\\resources\\Feature file\\RunMultipleDifferentbrowser.feature", 
    glue = "StepDefinitions",
    tags = "@TAG"
)
public class TestRunner {
	
}