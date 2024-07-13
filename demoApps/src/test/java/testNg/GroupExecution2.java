package testNg;

import org.testng.annotations.Test;

public class GroupExecution2 {

	@Test(priority = 6, groups = "regression")
	public void coupon() {
		
		System.out.println("The user has used Coupons in");
		
	}
	
	@Test(priority = 7, groups = "regression")
	public void wishlist() {
		
		System.out.println("The user has wishlisted");
		
	}
	
	
}
