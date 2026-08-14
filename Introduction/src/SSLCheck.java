import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.support.ui.Select;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul\\Documents\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		//dropdown with select tag
		System.out.println(driver.getTitle());
		
	}

}
