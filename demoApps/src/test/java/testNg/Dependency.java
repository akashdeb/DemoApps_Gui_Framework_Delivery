package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	
	@Test(priority = 1)
	public void login() {
		
		System.out.println("The user has logged in");
		
	}
	
	@Test(priority = 2)
	public void searchProduct() {
		
		System.out.println("The user has searched the product");
		
	}
	
	@Test(priority = 3, dependsOnMethods ="searchProduct" )
	public void addToCart() {
		Assert.fail();
		System.out.println("The user has added to cart");
		
	}
	
	
	@Test(priority = 4, dependsOnMethods = "addToCart")
	public void payment() {
		
		System.out.println("The user has paid");
		
	}
	
	@Test(priority = 5, dependsOnMethods = "login")
	public void logout() {
		
		System.out.println("The user has logged out");
		
	}

}
