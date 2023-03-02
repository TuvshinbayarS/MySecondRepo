package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		
		PageFactory.initElements(getDriver(), this);
		
	}
	
	@FindBy (id="profileImage")
	public WebElement profileImage;
	
	@FindBy (id="nameInput")
	public WebElement nameInput;
	
	@FindBy (id="personalPhoneInput")
	public WebElement personalPhoneInput;
	
	@FindBy (id="accountLink")
	public WebElement accountLink;
	
	@FindBy (id="personalUpdateBtn")
	public WebElement updateButton;
	
	@FindBy (xpath="//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateMessage;
	
	@FindBy(xpath="//div[@class='account__address-new']")
	public WebElement addAddressBtn;
	 
	@FindBy(xpath="//select[@id='countryDropdown']")
	public WebElement country;
	 
	 
	@FindBy(css=" #fullNameInput")
	public WebElement fullName;
	 
	@FindBy(css="#phoneNumberInput")
	public WebElement addressPhoneNumber;
	 
	@FindBy(xpath="//input[@id='streetInput']")
	public WebElement streetAddressOption;
	 
	@FindBy(xpath="//input[@id='apartmentInput']")
	public WebElement apartmentAddressInput;
	 
	 
	@FindBy(css="#cityInput")
	public WebElement addressCityInput;
	 
	 
	@FindBy(xpath="(//select[@class='account__address-new-dropdown'])[2]")
	public WebElement stateAddressInput;
	 
	@FindBy(id="zipCodeInput")
	public WebElement addressZipCodeInput;
	 
	@FindBy(xpath="//button[@id='addressBtn']")
	public WebElement addressSubmitButton;
	 
	 
	@FindBy(xpath=" //div[contains(text(),'Address Added Successfully')]")
	public WebElement addressMessageSuccessfull;
}
