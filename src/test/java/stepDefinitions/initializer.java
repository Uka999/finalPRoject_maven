package stepDefinitions;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class initializer extends Base {
	//we will write and our @before and afterhook method 
	//coming from cucumber
	
	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info("Scenario" + scenario.getName() + "Started");
		browser (); //launch browser
		openBrowser(); //url 
	}
	
	@After
	public void afterHooks (Scenario scenario) {
		tearDown();
		logger.info("Scenario" + scenario.getName() + " " + scenario.getStatus());
		
	}
}
