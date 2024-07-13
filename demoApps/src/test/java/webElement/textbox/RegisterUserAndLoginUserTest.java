package webElement.textbox;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtils.BaseClass;
import pomRepo.LoginPage;
import pomRepo.RegisterPage;

public class RegisterUserAndLoginUserTest extends BaseClass {
	
	
	@Test(priority = 1)
	public void toRegisterUserAndVerifyUserTest() throws EncryptedDocumentException, IOException, InterruptedException {
		
		String name = fUtils.fetchStringDataFromExcelSheet("RegisterUser", 1, 0);
		String email = fUtils.fetchStringDataFromExcelSheet("RegisterUser", 1, 1);
		String password = fUtils.fetchStringDataFromExcelSheet("RegisterUser", 1, 2);
		
		RegisterPage register = new RegisterPage(driver);
		LoginPage login=new LoginPage(driver);
		
		register.registerUser(name, email, password);
		Thread.sleep(2000);

		Assert.assertTrue(login.verifyRegisterPopUpIsDisplayed());
		System.out.println("PASS: the user has registered");
		Thread.sleep(2000);

	}
	
	@Test(priority = 2)
	public void toLoginUserAndVerifyUserTest() throws EncryptedDocumentException, IOException, InterruptedException {
	
		String email = fUtils.fetchStringDataFromExcelSheet("RegisterUser", 1, 1);
		String password = fUtils.fetchStringDataFromExcelSheet("RegisterUser", 1, 2);
		
		LoginPage login=new LoginPage(driver);
		
		login.loginUser(email, password);
		Thread.sleep(2000);

		Assert.assertTrue(login.verifyLoginPopUpIsDisplayed());
		System.out.println("PASS: the user has Logged in");
		
		Thread.sleep(2000);
	}

}
