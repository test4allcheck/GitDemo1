import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com"); //get will wait until the page is fully loaded
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/"); //it will not wait need to handle by implicit or explicit
		driver.navigate().back();
		driver.navigate().forward();
	}

}
