package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
	
	public CheckoutPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "phone")
	private WebElement phoneNoTextField;
	
	@FindBy(id="select2")
	private WebElement genderDropdown;
	
	
	@FindBy(id="select3")
	private WebElement countryDropdown;
	
	@FindBy(id="select5")
	private WebElement stateDropdown;
	
	@FindBy(xpath="//label[text()='City']/..//select")
	private WebElement cityDropdown;
	
	@FindBy(id = "continuebtn")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[text()='Submitted ']")
	private WebElement submittedPopUp;

	public WebElement getPhoneNoTextField() {
		return phoneNoTextField;
	}

	public WebElement getGenderDropdown() {
		return genderDropdown;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getStateDropdown() {
		return stateDropdown;
	}

	public WebElement getCityDropdown() {
		return cityDropdown;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getSubmittedPopUp() {
		return submittedPopUp;
	}
	
	public void enterDeliveryDetails(String phone, String gender, String country, String state, String city) {
		
		phoneNoTextField.sendKeys(phone);
		
		Select selectGender = new Select(genderDropdown);
		selectGender.selectByVisibleText(gender);
		
		Select selectCountry = new Select(countryDropdown);
		selectCountry.selectByVisibleText(country);
		
		Select selectState = new Select(stateDropdown);
		selectState.selectByVisibleText(state);
		
		Select selectCity = new Select(cityDropdown);
		selectCity.selectByVisibleText(city);
		
		continueButton.click();
		
		
	}
	
	public boolean verifyDeliveryDetailsSubmittedPopUpIsDisplayed() {
		return submittedPopUp.isDisplayed();
	}
	

}
