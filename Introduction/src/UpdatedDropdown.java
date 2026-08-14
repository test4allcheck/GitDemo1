import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(checkBoxes.size());
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.id("hrefIncAdt")).click(); //2 adults

		
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); 
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		//a[@value='MAA']
		//div[class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']
		
//		driver.navigate().to("https://www.spicejet.com/");
//		driver.manage().window().maximize();
//List<WebElement> boxes = driver.findElements(By.cssSelector("div[class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']"));
//System.out.println(boxes.get(1).getText());
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		
		if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}

}
