package webElement.dropdown;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtils.BaseClass;
import pomRepo.CheckoutPage;
import pomRepo.HomePage;

public class CreateDeliveryDetailsTest extends BaseClass {
	
	@Test(priority = 3)
	public void createDeliveryDetailsAndVerifyTest() throws EncryptedDocumentException, IOException, InterruptedException {
		
		String phoneNo = fUtils.fetchNumericDataFromExcelSheet("DeliverDetails", 1, 0)+"";
		String gender = fUtils.fetchStringDataFromExcelSheet("DeliverDetails", 1, 1);
		String country = fUtils.fetchStringDataFromExcelSheet("DeliverDetails", 1, 2);
		String state = fUtils.fetchStringDataFromExcelSheet("DeliverDetails", 1, 3);
		String city = fUtils.fetchStringDataFromExcelSheet("DeliverDetails", 1, 4);
		HomePage home = new HomePage(driver);
		CheckoutPage checkout = new CheckoutPage(driver);
		
		home.clickOnDropdownOption();
		
		checkout.enterDeliveryDetails(phoneNo, gender, country, state, city);
		Thread.sleep(2000);

		Assert.assertTrue(checkout.verifyDeliveryDetailsSubmittedPopUpIsDisplayed());
		System.out.println("PASS: the delivery details is added");

		
	}

}
