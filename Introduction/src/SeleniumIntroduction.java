import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chrome - ChromeDriver --> Methods 
		//Firefox - FirefoxDriver
		
		//chromedriver.exe->chrome browser 
		//steps to invoke chrome driver//
		//selenium manager
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul\\Documents\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rahul\\Documents\\geckodriver-v0.37.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Rahul\\Documents\\edgedriver_win64\\msedgedriver.exe");
		
		//Firefox Launch
		//webdriver.gecko.driver
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();

	}

}
