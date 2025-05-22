package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ProjectPage.WebShop_Pom_Page;

public class WebShop_Assignment extends WebShopBase {
	WebDriverWait wait;
	@Test
	void testlogin() throws InterruptedException
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		
		WebShop_Pom_Page w1 = new WebShop_Pom_Page(driver);
		w1.registerUser("Yash", "Chouksey", "yashchouksey73@gmail.com", "yash1122");
		Thread.sleep(2000);
		
	    w1.loginUser("yashchouksey73@gmail.com", "yash1122");
	    Thread.sleep(2000);
	              
        w1.addProductToCart();
        Thread.sleep(2000);
        
        w1.enterGiftCardDetails("Yash","yashchouksey73@gmail.com");
        Thread.sleep(2000);

        w1.goToShoppingCart();
        Thread.sleep(2000);   		
        driver.quit();
		
	}

}
