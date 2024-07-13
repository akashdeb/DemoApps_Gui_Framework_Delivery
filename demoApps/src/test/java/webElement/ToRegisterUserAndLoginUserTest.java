package webElement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomRepo.RegisterPage;

public class ToRegisterUserAndLoginUserTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		RegisterPage register=new RegisterPage(driver);
		register.registerUser("Viaks", "viaks@gmail.com", "qwer2345");


	}

}
