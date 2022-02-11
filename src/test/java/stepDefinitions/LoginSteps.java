package stepDefinitions;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;

public class LoginSteps extends Base {
	
	LoginPageObjects login = new LoginPageObjects();
	
	@Given ("^User is on test environment homepage$")
	public void User_is_on_test_environment_homepage() {
		
	}
	
	@When("User click on my account button")
	public void user_click_on_my_account_button() {
		login.clickOnMyAccountButton();;
	  
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
	   login.clickOnLoginButton();
	}

	@Then("User enter username and password")
	public void user_enter_username_and_password() {
	    login.enterusername();
	    login.enterPassword();
	}

	@Then("User click on login button to log in the page")
	public void user_click_on_login_button_to_log_in_the_page() {
		login.clickOnLoginButtonMain();
	}
	
}
