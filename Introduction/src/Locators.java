import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit wait 5 seconds
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //define implicit wait after driver declaration - something to show
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		try {
            // Pauses the thread for 2000 milliseconds (1 seconds)
		Thread.sleep(1000);
		} catch (InterruptedException e) {
            // Restore interrupted status or handle the interruption gracefully
            Thread.currentThread().interrupt(); 
            System.err.println("The thread sleep was interrupted.");
        }
		
		//Class name -> tagname.classname -> button.signInBtn
		//id-> tagname#id -> input#inputUsername
		//Class name-> tagname.classname -> 
		//Tagname[attribute='value']
		//Input[placeholder='Username']
		
		
		//Xpath--
		// //Tagname[@attribute='value']
		// //input[@placeholder='Username']
		//<p class="error" xpath="1">* Incorrect username or password </p>
		//<input type="text" placeholder="Username" id="inputUsername" value="" data-gtm-form-interact-field-id="0" xpath="1">
		// //input[@placeholder='Username']
		// input[@type='text'][1] 
		// css-> input[type='text']:nth-child(2)
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9335448793");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();//button[class='go-to-login-btn']
		try {
            // Pauses the thread for 2000 milliseconds (1 seconds)
		Thread.sleep(1000);
		} catch (InterruptedException e) {
            // Restore interrupted status or handle the interruption gracefully
            Thread.currentThread().interrupt(); 
            System.err.println("The thread sleep was interrupted.");
        }
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); //input[type*='pass'] css we can use regular expression
		driver.findElement(By.id("chkboxOne")).click(); //
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click(); //button[contains(@class, 'submit')].. //div[@class='forgot-pwd-btn-conainer']/button[1]
		
		
		
		
		
		//
		 
		
	}

}
