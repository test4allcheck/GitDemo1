package RahulAwachar.SeleniumFrameworkDesign;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import RahulAwachar.SeleniumFrameworkDesign.TestComponent.BaseTest;
import RahulAwachar.SeleniumFrameworkDesign.TestComponent.Retry;
import seleniumframeworkdesign.pageobjects.CartPage;
import seleniumframeworkdesign.pageobjects.CheckOutPage;
import seleniumframeworkdesign.pageobjects.ConfirmationPage;
import seleniumframeworkdesign.pageobjects.ProductCatalouge;

public class ErrorValidationsTest extends BaseTest{
	@Test(groups= {"ErrorHandling"}, retryAnalyzer=Retry.class)
	public void LoginErrorValidation()
	{
		// TODO Auto-generated method stub
		//class="ng-tns-c4-13 toast-message ng-star-inserted"
		//class="ng-tns-c4-14 ng-star-inserted ng-trigger ng-trigger-flyInOut ngx-toastr toast-error"
		String productName = "ZARA COAT 3";
		landingPage.loginApplication("test4allcheck@gmail.co", "tpchkLpa&3974");
		Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMessage());
		
	}
	
	
	@Test
	public void ProductErrorValidation() throws IOException, InterruptedException
	{
		String productName = "ZARA COAT 3";
		ProductCatalouge productCatalouge = landingPage.loginApplication("test4allcheck@gmail.com", "tpchkLpa&3974");		
//		List<WebElement> products = productCatalouge.getProductList();
		productCatalouge.addProductToCart(productName);
		CartPage cartPage = productCatalouge.goToCartPage();
		Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 33"); 
		Assert.assertFalse(match);
	}

}
