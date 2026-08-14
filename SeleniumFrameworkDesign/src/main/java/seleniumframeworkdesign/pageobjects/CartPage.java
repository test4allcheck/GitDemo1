package seleniumframeworkdesign.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import seleniumframeworkdesign.AbstractComponents.AbstractComponent;

public class CartPage extends AbstractComponent{
	
	WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement userEmail = driver.findElement(By.id("userEmail"));
	
	//PageFactory - reduce the syntax for creating the webelemet
	
	@FindBy(css=".cartSection h3")
	List<WebElement> productTitles;
	
	@FindBy(css=".totalRow button")
	WebElement checkoutEle;
	
	
	public Boolean VerifyProductDisplay(String productName)
	{
		Boolean match = productTitles.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(productName));
		//Assert.assertTrue(match);
		return match;
	}
	
	public CheckOutPage goToCheckout()
	{
		checkoutEle.click();
		return new CheckOutPage(driver);
	}
}
