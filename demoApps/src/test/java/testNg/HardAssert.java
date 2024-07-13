package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void test1() {
		String a = "Qspiders";
		String b = "Jspiders";
		
	Assert.assertEquals(a, b);
	System.out.println("Pass");
	} 

	
	@Test
	public void test2() {
		String a = "Qspiders";
		String b = "spiders";
		
	Assert.assertTrue(a.contains(b));
	System.out.println("Pass");
	} 

}
