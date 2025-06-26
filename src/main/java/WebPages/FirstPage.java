package WebPages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstPage {

	private WebDriver driver;

	private By svgloc=By.xpath("//*[local-name()='svg' and @id='Layer_1']");
	private By selLoc=By.className("form-select");
	private By items=By.cssSelector(".col-md-9 h5");
	private By itemsAfterSort=By.cssSelector(".col-md-9 div[data-test='sorting_completed'] h5");

	public FirstPage(WebDriver driver) {
		this.driver=driver;

	}


	public void isSvgEleDisplayed() {

		WebElement svgEle=getElement(svgloc);

		boolean isSvgDisp=isDisplayed(svgloc);

		if(isSvgDisp==true) {
			System.out.println("Svg element is displayed successfully");

		}
		else {
			System.out.println("Svg element not displayed ");

		}
	}
	
	public void getListofItems() {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		List<WebElement> itemslist=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(items));
		
		//Thread.sleep(5000);
		//By items=By.cssSelector(".col-md-9 h5");

		//List<WebElement> itemslist=getElementss(items);

		for(WebElement e : itemslist) {
			System.out.println(e.getText());
		}
		
	}

	public void clickAnItemFromDropDown(int indexNo,String itemName)  {
		
		
		Select sel=new Select(visibltyofElementloc(selLoc));

		//Select sel=new Select(getElement(selLoc));
		sel.selectByIndex(indexNo);

       
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		List<WebElement> itemslist=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(itemsAfterSort));
		
		//Thread.sleep(5000);
		//By items=By.cssSelector(".col-md-9 h5");

		//List<WebElement> itemslist=getElementss(items);
		List<String> item=new ArrayList<String>();
		for(WebElement e : itemslist) {
			System.out.println(e.getText());
			String name=e.getText();
			item.add(name);
			
			
			
			
			  if(item.equals(itemName)) { e.click(); }
			 
			 
		}
		

	}










	public  WebElement getElement(By locatorname) {
		return driver.findElement(locatorname);
	}

	public   boolean isDisplayed(By locatorname) {

		return getElement(locatorname).isDisplayed();
	}

	public   List<WebElement> getElementss(By locatorname) {
		return driver.findElements(locatorname);
	}
	
	public WebElement visibltyofElementloc(By locator) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}


}
