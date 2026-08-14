import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //define implicit wait after driver declaration - something to show
		driver.manage().window().maximize(); //this is important for the driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click() to work or else it will fail with element not intractable
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		
		
	}

}
