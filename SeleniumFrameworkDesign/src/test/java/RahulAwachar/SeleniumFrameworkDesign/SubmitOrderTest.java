package RahulAwachar.SeleniumFrameworkDesign;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import RahulAwachar.SeleniumFrameworkDesign.TestComponent.BaseTest;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumframeworkdesign.pageobjects.CartPage;
import seleniumframeworkdesign.pageobjects.CheckOutPage;
import seleniumframeworkdesign.pageobjects.ConfirmationPage;
import seleniumframeworkdesign.pageobjects.LandingPage;
import seleniumframeworkdesign.pageobjects.OrderPage;
import seleniumframeworkdesign.pageobjects.ProductCatalouge;

public class SubmitOrderTest extends BaseTest{
	String productName = "ZARA COAT 3";
	//public static void main(String[] args) {
	@Test (dataProvider="getData", groups= {"Purchase"})
	//public void submitOrder(String email, String password, String productName) throws IOException, InterruptedException
	public void submitOrder(HashMap<String, String> input) throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub

		//LandingPage landingPage = launchApplication(); //@BeforeMethod
		//WebDriverManager.chromedriver().setup();
		/*
		 * WebDriver driver = new ChromeDriver();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.manage().window().maximize();
		 */
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//driver.get("https://rahulshettyacademy.com/client");
//		LandingPage landingPage = new LandingPage(driver);
//		landingPage.goTo();
		ProductCatalouge productCatalouge = landingPage.loginApplication(input.get("email"), input.get("password"));		
//ProductCatalouge productCatalouge = new ProductCatalouge(driver);
//		List<WebElement> products = productCatalouge.getProductList();
		productCatalouge.addProductToCart(input.get("product"));
		CartPage cartPage = productCatalouge.goToCartPage();
//CartPage cartPage = new CartPage(driver);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		//List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	
	//	WebElement prod = products.stream().filter(product->
	//		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		//prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
				//div[class="card"] 
				//toast-container
		
	
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
		//wait.until(ExpectedConditions.invisibilityOfAllElements(driver.findElements(By.cssSelector(".ng-animating")))); //wait for this or ealse clicking on cart will not work
		
		
	//	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[routerlink*='cart']"))));
		//driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		
		//.cartSection h3
		//List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
		//Boolean match = cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(productName));
		//Assert.assertTrue(match);
		
		//li[class='totalRow'] button[type='button']
		
		
		Boolean match = cartPage.VerifyProductDisplay(input.get("product")); 
		Assert.assertTrue(match);
		CheckOutPage checkOutPage = cartPage.goToCheckout();
		checkOutPage.selectCountry("india");
		ConfirmationPage confirmationPage = checkOutPage.submitOrder();
		//driver.findElement(By.cssSelector(".totalRow button")).click();
		
		
		
		
//		Actions a = new Actions(driver);
//		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
//		driver.findElement(By.xpath("//button[contains(@class, 'ta-item')][2]")).click();
//		driver.findElement(By.cssSelector(".action__submit")).click();
		//button[contains(@class, 'ta-item')])[2]
		
		//String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
		String confirmMessage = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equals("THANKYOU FOR THE ORDER."));
		
		//driver.quit(); @AfterMethod //replace driver.close with driver.quit to prevent org.openqa.selenium.remote.http.WebSocket$Listener onError WARNING: Connection reset
		
		
	}
	
	@Test(dependsOnMethods= {"submitOrder"})
	public void OrderHistoryTest()
	{
		ProductCatalouge productCatalouge = landingPage.loginApplication("test4allcheck@gmail.com", "tpchkLpa&3974");	
		OrderPage ordersPage = productCatalouge.goToOrdersPage();
		Assert.assertTrue(ordersPage.VerifyOrderDisplay(productName));
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{

		List<HashMap<String, String>>  data = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//RahulAwachar//Data//PurchaseOrder.json");
		return new Object[][] {{data.get(0)}, {data.get(1)}};
		
//		HashMap<String,String> map = new HashMap<String, String>();
//		map.put("email", "test4allcheck@gmail.com");
//		map.put("password", "tpchkLpa&3974");
//		map.put("product", "ZARA COAT 3");
//
//		HashMap<String,String> map1 = new HashMap<String, String>();
//		map1.put("email", "dwnact@gmail.com");
//		map1.put("password", "tpdwnLpa&3974");
//		map1.put("product", "ADIDAS ORIGINAL");
		//return new Object [] [] { {map}, {map1} };
		
		//return new Object [] [] { {"test4allcheck@gmail.com", "tpchkLpa&3974", "ZARA COAT 3"}, {"dwnact@gmail.com", "tpdwnLpa&3974", "ADDIDAS ORIGNAL"} };
	}
}
