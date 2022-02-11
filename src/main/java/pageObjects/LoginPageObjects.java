package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObjects extends Base{
	public LoginPageObjects () { 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text () = 'TEST ENVIRONMENT']")
	private WebElement textToValidate;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;
	@FindBy (xpath = "//a[text()='Login']")
	private WebElement loginButton;
	@FindBy(xpath ="//input [@ id = 'input-email']")
	private WebElement usernameField;
	@FindBy (xpath = "//input [@ id = 'input-password']")
	private WebElement passwordField;
	@FindBy (xpath = "//input [@class = 'btn btn-primary']")
	private WebElement loginButtonMain;
	
	
	public void validatehomePage () {
		String text = textToValidate.getText();
		if (text.equalsIgnoreCase("TEST ENVIRONMENT"));
			logger.info("Text Verified!");
	}else { 
			logger.info("Text does not Match!!");
	}
	
	public void clickOnMyAccountButton () {
		myAccountButton.click();
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	public void enterusername () {
		usernameField.sendKeys("test@test.com");
	}
	public void enterPassword() {
		passwordField.sendKeys("123456");
	}
	public void clickOnLoginButtonMain () {
		loginButtonMain.click();
	}
	
	
}
