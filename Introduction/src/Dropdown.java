import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //define implicit wait after driver declaration - something to show
		driver.manage().window().maximize(); //this is important for the driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click() to work or else it will fail with element not intractable
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getText());
		//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys(Keys.ENTER);
		//System.out.println("done");
driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//Thread.sleep(2000);
//		driver.findElement(By.xpath("(//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//a[@value='BLR']
		//a[@value='MAA']
		//(//a[@value='MAA'])[2]
		
		//Parent to child xPath -> //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']
		//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']
	}

}
