package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import ProjectPage.WebShop_Pom_Page;

public class WebShopBase {
	public WebDriver driver;
	
	 @BeforeMethod
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demowebshop.tricentis.com/"); 
	        WebShop_Pom_Page webship  = new WebShop_Pom_Page(driver);
	    }
	 
	 @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }

}
