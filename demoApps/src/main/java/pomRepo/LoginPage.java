package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email") 
	private WebElement emailTextfield;
	
	@FindBy(id="password") 
	private WebElement passwordTextfield;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//div[text()='Registered successfully']")
	private WebElement registerPopUp;
	

	@FindBy(xpath = "//div[text()='Signin successful']")
	private WebElement loginPopUp;
	
	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	
	public WebElement getRegisterPopUp() {
		return registerPopUp;
	}

	public WebElement getLoginPopUp() {
		return loginPopUp;
	}

	public void loginUser(String email, String password) {
		emailTextfield.sendKeys(email);
		passwordTextfield.sendKeys(password);
		loginButton.click();
	}
	
	public boolean verifyRegisterPopUpIsDisplayed() {
		return registerPopUp.isDisplayed();
	}
	
	public boolean verifyLoginPopUpIsDisplayed() {
		return loginPopUp.isDisplayed();
	}

}
