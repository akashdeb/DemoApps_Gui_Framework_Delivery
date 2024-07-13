package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class MultipleData {
	
	@Test(dataProvider = "data")
	public void searchProduct(String name, String product, int qty) {
		
		System.out.println("The User "+name+" wants "+product+" in qauntity "+qty);
		
	}
	
	
	@DataProvider
	public Object[][] data() {
		
		Object[][] arr = new Object[3][3];
		
		arr[0][0]="Sunny";
		arr[1][0]="Rudra";
		arr[2][0]="Saloni";
		
		arr[0][1]="Iphone";
		arr[1][1]="MacBook";
		arr[2][1]="Car";
		
		arr[0][2]=5;
		arr[1][2]=10;
		arr[2][2]=2;
		
		return arr;
	}

}
