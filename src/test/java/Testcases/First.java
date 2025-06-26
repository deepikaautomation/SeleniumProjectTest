package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v128.page.model.AdFrameStatus;
import org.testng.annotations.Test;

import TestBaseTest.BaseTest;

public class First extends BaseTest{
	
	
	
	
	
	
	@Test
	public void isElementDisplayedTest() {
		
		frst.isSvgEleDisplayed();
		
	}
}
	
	
	//static WebDriver driver;
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//driver=new ChromeDriver();
		//driver.get("https://practicesoftwaretesting.com/");
		
		
		//By svgloc=By.xpath("//*[local-name()='svg' and @id='Layer_1']");
		//WebElement svgEle=getElement(svgloc);
		
		/*
		 * boolean isSvgDisp=isDisplayed(svgloc);
		 * 
		 * if(isSvgDisp==true) {
		 * System.out.println("Svg element is displayed successfully");
		 * 
		 * } else { System.out.println("Svg element not displayed "); } }
		 */
	
	
		/*
		 * public static WebElement getElement(By locatorname) { return
		 * driver.findElement(locatorname); }
		 * 
		 * public static boolean isDisplayed(By locatorname) {
		 * 
		 * return getElement(locatorname).isDisplayed(); }
		 */
	
	

//}
