package Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng11 {
	
	@BeforeSuite
	public void dbconnection() {
		System.out.println("DB CONNECTION STAARTED   bEFORE sUITE");
	}
	
	
	@BeforeClass
	public void classstarted() {
		System.out.println("class intiated   Before class");
	}
	@BeforeTest
	public void driverstarted() {
		System.out.println("Driver intiated   Before test");
	}
	
	
	
	@BeforeMethod
		public void login() {
			
			System.out.println("logged suucessfully  ---before Method");
			
	}
	
	
	
	@Test(invocationCount = 5)
	public void titleCheck() {
		
		
		String expectedTite="Amazon";
		String actualTitle="Amazon111";
		
		System.out.println("Title check");
		
		Assert.assertEquals(expectedTite, actualTitle);
	}
	
	
	@Test(priority = 1)
	public void urlcheck() {
		
		String expectedurl="Amazon223";
		String actualurl="Amazon223";
		
		System.out.println("url check");
		
		Assert.assertEquals(expectedurl, actualurl);
		
		
	}
	
	
	@Test(priority=1)
	public void acccheck() {
		
		String expectedurl="Amazon223";
		String actualurl="Amazon223";
		
		System.out.println("acc check");
		
		Assert.assertEquals(expectedurl, actualurl);
		
	}
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	
	public void loginTest() {
		
		System.out.println("Login Test");
		
		int i=9/0;
	}
	
	
	
	@Test
	public void addToCartTest() {
		
		System.out.println("Add To cart");
		int i=9/0;
		
	}
	
	
	@Test(dependsOnMethods = "addToCartTest")
	public void makepaymentTest() {
		System.out.println("makepayment");
	}
	
	
	
	
	
	
	@AfterMethod
	public void logout() {
		
		System.out.println("logged out suucessfully  --After Method");
		
		
	}
	
	
	@AfterClass
	public void classdone() {
		System.out.println("class done   Before class");
	}
	
	
	
	
	
	
	
	@AfterTest
	public void driverclose() {
		System.out.println("Driver closed   After test");
	}
	
	@AfterSuite
	public void closeconnectiondb() {
		System.out.println("DB CONNECTION CLOSED   AFTER sUITE");
	}

}
