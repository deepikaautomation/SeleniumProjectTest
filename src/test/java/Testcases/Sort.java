package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestBaseTest.BaseTest;

public class Sort extends BaseTest {
	
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {
			{3,"Tool Cabinet"}
		};
	}
		
	
	
	
	
	@Test(dataProvider="getData")
	public void selectanItem(int indexno,String itemName)  {
		frst.clickAnItemFromDropDown(indexno,itemName);
	}
	
	@Test
	public void checkgetList() {
		frst.getListofItems();
	}
	
	

	/*
	 * static WebDriver driver; public static void main(String[] args) throws
	 * InterruptedException { // TODO Auto-generated method stub
	 * 
	 * driver=new ChromeDriver();
	 * driver.get("https://practicesoftwaretesting.com/");
	 * 
	 * driver.manage().window().maximize();
	 * 
	 * Thread.sleep(5000);
	 * 
	 * By selLoc=By.className("form-select");
	 * 
	 * Select sel=new Select(getElement(selLoc)); sel.selectByIndex(3);
	 * 
	 * 
	 * Thread.sleep(5000); By items=By.cssSelector(".col-md-9 h5");
	 * 
	 * List<WebElement> itemslist=getElementss(items);
	 * 
	 * for(WebElement e : itemslist) { System.out.println(e.getText()); }
	 * 
	 * 
	 * }
	 * 
	 * 
	 * public static WebElement getElement(By locatorname) { return
	 * driver.findElement(locatorname); }
	 * 
	 * public static List<WebElement> getElementss(By locatorname) { return
	 * driver.findElements(locatorname); }
	 */

}
