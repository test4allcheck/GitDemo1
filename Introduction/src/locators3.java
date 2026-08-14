import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		////header/div/button[1]/following-sibling::button[1] -- Parent to child
		///  //header/div/button[1]/parent::div/parent::header/a -- child to parent
		/// 
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		//header/div/button[1]/parent::div/button[2]
	}

}
