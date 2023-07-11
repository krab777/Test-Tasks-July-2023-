package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/GoogleSearch.feature"}, glue = {"steps"})
class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}