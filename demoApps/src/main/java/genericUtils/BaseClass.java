package genericUtils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fUtils=new FileUtility();
	
	
	@BeforeSuite
	public void bs() {
		System.out.println("Data Base Connectivity is Achieved");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("To launch the browser during parrallel execution");
	}
	
	
	@BeforeClass
	public void bc() throws IOException {
		
		String browserName = fUtils.fetchDataDFromPropertyFile("browser");
		String url = fUtils.fetchDataDFromPropertyFile("url");

		
		if(browserName.equals("chrome")) {
			driver= new ChromeDriver();
		}
		
		if(browserName.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		
		if(browserName.equals("edge")) {
			driver= new EdgeDriver();
		}
		System.out.println("Launch the Browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		System.out.println("Navigate to the URL");

		
	}
	
	
	@BeforeMethod
	public void bm() {
		System.out.println("Login to the Application");
	}
	
	
	@AfterMethod
	public void am() {
		System.out.println("Logout from the application");
	}
	
	
	@AfterClass
	public void ac() {
		driver.quit();
		System.out.println("Close the browser");
	}
	
	@AfterTest
	public void at() {
		System.out.println("This is After test");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("Close the Data Base");
	}
	

}
