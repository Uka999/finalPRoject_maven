package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
	features = "C:\\Users\\Uka\\eclipse-workspace\\finalPRoject_maven\\Features",
	glue = "src\\test\\java\\stepDefinitions",
	tags = " @loginToTestEnv",
	dryRun = true,
	monochrome = true
	
	)

	public class TestRunner {
	
}
