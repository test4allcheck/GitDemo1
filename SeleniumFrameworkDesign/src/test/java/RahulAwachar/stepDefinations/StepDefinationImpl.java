package RahulAwachar.stepDefinations;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import RahulAwachar.SeleniumFrameworkDesign.TestComponent.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seleniumframeworkdesign.pageobjects.CartPage;
import seleniumframeworkdesign.pageobjects.CheckOutPage;
import seleniumframeworkdesign.pageobjects.ConfirmationPage;
import seleniumframeworkdesign.pageobjects.LandingPage;
import seleniumframeworkdesign.pageobjects.ProductCatalouge;

public class StepDefinationImpl extends BaseTest{
	public LandingPage landingPage;
	public ProductCatalouge productCatalouge;
	public ConfirmationPage confirmationPage;
		@Given("I landed on Ecommerce Page")
		public void I_landed_on_Ecommerce_Page() throws IOException
		{
			landingPage = launchApplication();
		}
		
		@Given("^Logged in with username (.+) and password (.+)$")
		public void logged_in_username_password(String username, String password)
		{
			productCatalouge = landingPage.loginApplication(username, password);	
		}
		
		@When("^I add the product (.+) from the cart$")
		public void I_add_product_to_cart(String productName) throws InterruptedException
		{
			//List<WebElement> products = productCatalouge.getProductList();
			productCatalouge.addProductToCart(productName);
			
		}
		@When("^Checkout (.+) and submit the order$")
		public void checkout_submit_order(String productName)
		{
			CartPage cartPage = productCatalouge.goToCartPage();
			Boolean match = cartPage.VerifyProductDisplay(productName); 
			Assert.assertTrue(match);
			CheckOutPage checkOutPage = cartPage.goToCheckout();
			checkOutPage.selectCountry("india");
			confirmationPage = checkOutPage.submitOrder();
		}
		
		@Then("{string} message is displayed on confirmation page")
		public void message_is_displayed_on_confirmation_page(String string)
		{
			String confirmMessage = confirmationPage.getConfirmationMessage();
			Assert.assertTrue(confirmMessage.equals(string));
			driver.close();
		}
		
		//@Then("^\"([^\"]*)\" message is displayed$")
		@Then("{string} message is displayed")
		public void some_message_is_displayed(String string) throws Throwable
		{
			Assert.assertEquals(string, landingPage.getErrorMessage());
			driver.close();
		}
}
