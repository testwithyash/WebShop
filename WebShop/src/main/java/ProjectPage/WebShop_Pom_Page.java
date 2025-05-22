package ProjectPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebShop_Pom_Page {

public WebDriver driver;
WebDriverWait wait;
	
	//Constructor
       public WebShop_Pom_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}
       
       @FindBy(xpath = "//a[@class='ico-register']")
       private WebElement registerLink;

       @FindBy(id = "gender-male")
       private WebElement genderMale;

       @FindBy(name = "FirstName")
       private WebElement firstName;

       @FindBy(id = "LastName")
       private WebElement lastName;

       @FindBy(name = "Email")
       private WebElement email;

       @FindBy(id = "Password")
       private WebElement password;

       @FindBy(name = "ConfirmPassword")
       private WebElement confirmPassword;

       @FindBy(id = "register-button")
       private WebElement registerButton;

       @FindBy(linkText = "Log in")
       private WebElement loginLink;

       @FindBy(xpath = "//input[@class='email' and @name='Email']")
       private WebElement loginEmail;

       @FindBy(id = "Password")
       private WebElement loginPassword;

       @FindBy(className = "login-button")
       private WebElement loginButton;

       @FindBy(css = "input.button-2.product-box-add-to-cart-button")
       private WebElement addToCartButton;

       @FindBy(name = "giftcard_2.RecipientName")
       private WebElement recipientName;

       @FindBy(id = "giftcard_2_RecipientEmail")
       private WebElement recipientEmail;

       @FindBy(id = "add-to-cart-button-2")
       private WebElement addGiftCardToCart;

       @FindBy(linkText = "Shopping cart")
       private WebElement shoppingCartLink;
       
          //Action Method
              
       public void registerUser(String fname, String lname, String userEmail, String userPassword) {
    	   wait.until(ExpectedConditions.elementToBeClickable(registerLink)).click();
           wait.until(ExpectedConditions.elementToBeClickable(genderMale)).click();
           firstName.sendKeys(fname);
           lastName.sendKeys(lname);
           email.sendKeys(userEmail);
           password.sendKeys(userPassword);
           confirmPassword.sendKeys(userPassword);
           //registerButton.click();
       }
       
       
       
       public void loginUser(String userEmail, String userPassword) {
    	   wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
           loginEmail.sendKeys(userEmail);
           loginPassword.sendKeys(userPassword);
           loginButton.click();
       }
        
       public void addProductToCart() {
    	   wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
    	   
       }
       
       public void enterGiftCardDetails(String recipient, String recipientEmailValue) {
           recipientName.sendKeys(recipient);
           recipientEmail.sendKeys(recipientEmailValue);
           addGiftCardToCart.click();
           
       }
        
       public void goToShoppingCart() {
           
		wait.until(ExpectedConditions.elementToBeClickable(shoppingCartLink)).click();
		
       }
       
       
}
