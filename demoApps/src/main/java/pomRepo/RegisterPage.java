package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="name") 
	private WebElement nameTextfield;
	
	@FindBy(id="email") 
	private WebElement emailTextfield;
	
	@FindBy(id="password") 
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//button[text()='Register']") 
	private WebElement registerButton;
	
	public WebElement getNameTextfield() {
		return nameTextfield;
	}

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public void registerUser(String name, String email, String password) {
		
		nameTextfield.sendKeys(name);
		emailTextfield.sendKeys(email);
		passwordTextfield.sendKeys(password);
		registerButton.click();
		
	}

}
