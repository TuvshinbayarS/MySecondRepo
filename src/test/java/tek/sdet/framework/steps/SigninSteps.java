package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class SigninSteps extends CommonUtility{

	private POMFactory factory = new POMFactory();
	
	@Given("user is on retail website")
	public void userIsOnRetailWebsite() {   
		 Assert.assertTrue(isElementDisplayed(factory.homePage().signInButton));
		 logger.info("user on the retial website");
	}
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
	    click(factory.homePage().signInButton);
	    logger.info("User clicked on Sign in option");
	}
	
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passwordValue) {
	    sendText(factory.signInPage().emailField, emailValue);
	    sendText(factory.signInPage().passwordField, passwordValue);
	    logger.info("user entered email " +emailValue + " and password " +passwordValue);
	}
	@And("User click on login button")
	public void userClickOnLoginButton() {
	   click(factory.signInPage().loginPageButton);
	   logger.info("user clikced on login button");
	}
	
	@Then("User should be logged into Account")
	public void userShouldBeLoggedIntoAccount() {
	    Assert.assertTrue(isElementDisplayed(factory.signInPage().accountOption));
	    logger.info("user on the account page");
	}
	
// Create new Account
	
	@When("User can click on Create new account button")
	public void userCanClickOnCreateNewAccountButton() {
	    click(factory.signInPage().createNewAccountButton);
	    logger.info("user clicked on the create new account button");
	}
	
	@When("User fill the signUp information with the below data")
	public void userFillTheSignUpInformationWithTheBelowData(DataTable dataTable) {
	    List<Map<String, String>> signUpInformation = dataTable.asMaps(String.class, String.class);
	    
	    sendText(factory.signInPage().signupNameInput, DataGeneratorUtility.data(signUpInformation.get(0).get("name")));
	    sendText(factory.signInPage().signupEmailInput, DataGeneratorUtility.data(signUpInformation.get(0).get("email")));
	    sendText(factory.signInPage().signupPasswordInput, signUpInformation.get(0).get("password"));
	    sendText(factory.signInPage().signupConfirmPasswordInput, signUpInformation.get(0).get("confirmPassword"));
	    logger.info("user filled required signup information");
	}
	
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
	 
		click(factory.signInPage().signupButton);
		logger.info("user clicked on the signup button");
	}
	
	@Then("User should be logged into new Account")
	public void userShouldBeLoggedIntoNewAccount() {
	    Assert.assertTrue(isElementDisplayed(factory.accountPage().profileImage));
		logger.info("user on account page");
	}

	
}
