package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Opencart {
	
	private WebDriver driver;
	By firstName=By.id("input-firstname");
	By lastName=By.id("input-lastname");
	
	public Opencart(WebDriver driver) {
		
		this.driver=driver;
	}
	
  
	public  WebElement getElement(By locatorname) {
		return driver.findElement(locatorname);
	}

	
	public  void sendKeysfn(String name) {
		  getElement(firstName).sendKeys(name);
	}
	
	public  void sendKeysln(String name) {
		  getElement(lastName).sendKeys(name);
	}
	
	
}
