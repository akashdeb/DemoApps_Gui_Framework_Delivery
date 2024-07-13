package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//section[text()='Dropdown']")
	private WebElement dropdownOption;

	public WebElement getDropdownOption() {
		return dropdownOption;
	}
	
	public void clickOnDropdownOption() {
		dropdownOption.click();
	}
	
}
