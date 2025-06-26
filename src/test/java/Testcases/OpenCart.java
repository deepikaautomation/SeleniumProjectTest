package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestBaseTest.BaseTest;

public class OpenCart extends BaseTest{
	
	@DataProvider
	
	public Object[][] getData() {
		
		return new Object[][] {
			{"Divya","AS"},
			{"Deepika","DR"},
			{"DDD","RR"}
			
		};
		
		
		
		
	}
	
	
	
	
	@Test(dataProvider ="getData")
	
	public void regPage(String fname,String lname) {
		
		open.sendKeysfn(fname);
		open.sendKeysln(lname);
		
	}

}
