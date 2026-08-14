import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//button[contains(text(), 'PROCEED TO CHECKOUT')]
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5)); //Explicit wait

		String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Carrot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode"))); //Explicit wait
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo"))); //Explicit wait
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		//span.promoInfo   Code applied ..!
	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++)
		{
			
			
			
			String [] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			
			List itemsNeededList=Arrays.asList(itemsNeeded);
			
			//if(name.contains("Cucumber"))
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				//button[text()='ADD TO CART']
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click(); ////button[text()='ADD TO CART']
				//break;
				
				if (j==itemsNeeded.length) {break;}
			}
		}
	}

}

