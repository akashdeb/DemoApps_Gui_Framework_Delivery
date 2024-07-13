package testNg;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 1)
	public void login() {
		
		System.out.println("The user has logged in");
		
	}
	
	@Test(priority = 2)
	public void searchProduct() {
		
		System.out.println("The user has searched the product");
		
	}
	
	@Test(priority = 3)
	public void addToCart() {
		
		System.out.println("The user has added to cart");
		
	}
	
	
	@Test(priority = 4)
	public void payment() {
		
		System.out.println("The user has paid");
		
	}
	
	@Test(priority = 5)
	public void logout() {
		
		System.out.println("The user has logged out");
		
	}

}
