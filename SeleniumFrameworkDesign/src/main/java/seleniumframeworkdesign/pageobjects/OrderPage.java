package seleniumframeworkdesign.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import seleniumframeworkdesign.AbstractComponents.AbstractComponent;

public class OrderPage extends AbstractComponent{
	
	WebDriver driver;
	
	public OrderPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement userEmail = driver.findElement(By.id("userEmail"));
	
	//PageFactory - reduce the syntax for creating the webelemet
	
	@FindBy(css="tr td:nth-last-child(5)")
	List<WebElement> productNames;
	
	@FindBy(css=".totalRow button")
	WebElement checkoutEle;
	
	
	public Boolean VerifyOrderDisplay(String productName)
	{
		Boolean match = productNames.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(productName));
		//Assert.assertTrue(match);
		return match;
	}
	

}
