package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/resources/FeatureFiles"},glue="stepDefinitions",publish=true)
public class LeaftapsTC1 extends AbstractTestNGCucumberTests {
	
}
