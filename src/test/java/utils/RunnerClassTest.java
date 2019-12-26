package utils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/PC Solutions/Desktop/APIBDDTWITTER/src/test/java/resources/twitter.feature",glue = {"StepDefs"},plugin = "json:target/cucumber.json")

public class RunnerClassTest {
}
