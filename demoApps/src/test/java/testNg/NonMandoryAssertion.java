package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NonMandoryAssertion {

	@Test
	public void test1() {
		String a = "Qspiders";
		String b = "Jspiders";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a, b);
		
		sa.assertAll();
		System.out.println("Pass");
		
		
	}
	
	@Test
	public void test2() {
		String a = "Qspiders";
		String b = "spiders";
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(a.contains(b));
		
		sa.assertAll();
		System.out.println("Pass");
		
		
	}

}
