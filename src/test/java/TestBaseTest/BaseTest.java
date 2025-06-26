package TestBaseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import WebPages.FirstPage;
import WebPages.Opencart;

public class BaseTest {
	
	protected WebDriver driver;
	protected FirstPage frst;
	protected Opencart open;
	
	
	@Parameters({"urlname"})
	@BeforeTest
	public void setUp(String url) {
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    //driver.get("https://practicesoftwaretesting.com");
		driver.get(url);
		
		frst=new FirstPage(driver);
		
		open=new Opencart(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
