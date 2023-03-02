package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class RetailAccountSteps extends CommonUtility{

	private POMFactory factory = new POMFactory();
	
	@When("User click on account option")
	public void userClickOnAccountOption() {
	click(factory.homePage().accountOption);
	logger.info("user clicked on the account menu");
	}
	
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
	clearTextUsingSendKeys(factory.accountPage().nameInput);
	sendText(factory.accountPage().nameInput, nameValue);
	clearTextUsingSendKeys(factory.accountPage().personalPhoneInput);
	sendText(factory.accountPage().personalPhoneInput, phoneValue);
	logger.info("user updated name: " + nameValue + " and phone value: " + phoneValue);
		
	}
	@When("User click on update button")
	public void userClickOnUpdateButton() {
	click(factory.accountPage().updateButton);
	logger.info("user clicked on the update button");
	}
	
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
	waitTillPresence(factory.accountPage().personalInfoUpdateMessage);
	Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateMessage));
	logger.info("personal information updated successfully message displayed");
		
	}

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
	    click(factory.accountPage().addAddressBtn);
	    logger.info("user clicked on add address button");
	}
	
	@When("User fill new address with below information")
	public void userFillNewAddressWithBelowInformation(DataTable dataTable) {
	 List <List<String>> addressInfo = dataTable.asLists(String.class);
	 selectByVisibleText(factory.accountPage().country, DataGeneratorUtility.data(addressInfo.get(0).get(0)));
	 sendText(factory.accountPage().fullName, DataGeneratorUtility.data(addressInfo.get(0).get(1)));
	 sendText(factory.accountPage().addressPhoneNumber, DataGeneratorUtility.data(addressInfo.get(0).get(2)));
	 sendText(factory.accountPage().streetAddressOption, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
	 sendText(factory.accountPage().apartmentAddressInput, DataGeneratorUtility.data(addressInfo.get(0).get(4)));
	 sendText(factory.accountPage().addressCityInput, DataGeneratorUtility.data(addressInfo.get(0).get(5)));
	 selectByVisibleText(factory.accountPage().stateAddressInput, DataGeneratorUtility.data(addressInfo.get(0).get(6)));
	 sendText(factory.accountPage().addressZipCodeInput, DataGeneratorUtility.data(addressInfo.get(0).get(7)));
	
	 logger.info("user entered address info");
	}
	
	@When("User click add your address button")
	public void userClickAddYourAddressButton() {
	   click(factory.accountPage().addressSubmitButton);
	   logger.info("user clicked on add your address button");
	}
	
	@Then("a message shoud be displayed {string}")
	public void aMessageShoudBeDisplayed(String expectedMessage) {
	  
		waitTillPresence(factory.accountPage().addressMessageSuccessfull);
		Assert.assertEquals(expectedMessage, factory.accountPage().addressMessageSuccessfull.getText());
		
	}
	
	
	
	
}
