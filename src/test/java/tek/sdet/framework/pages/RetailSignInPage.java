package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(),this);
	
	}

	@FindBy (xpath="//h1[text()='Sign in']")
	public WebElement signPageLogo;
	
	@FindBy (id="email")
	public WebElement emailField;
	
	@FindBy (id="password")
	public WebElement passwordField;
	
	@FindBy (xpath="//button[text()='Login']")
	public WebElement loginPageButton;
	
	@FindBy (linkText="Create New Account")
	public WebElement createNewAccountButton;
	
	@FindBy (id="New Company Account")
	public WebElement wantToSellSomethingLink;
	
	@FindBy (xpath="//a[text()='Account']")
	public WebElement accountOption;
	
	@FindBy (id="nameInput")
	public WebElement signupNameInput;
	
	@FindBy (id="emailInput")
	public WebElement signupEmailInput;
	
	@FindBy (id="passwordInput")
	public WebElement signupPasswordInput;
	
	@FindBy (id="confirmPasswordInput")
	public WebElement signupConfirmPasswordInput;
	
	@FindBy (id="signupBtn")
	public WebElement signupButton;
	
	
	
}
