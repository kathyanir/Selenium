package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // wait for the page to load
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).clear();
		
		// Absolute xpath
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("admin");
		
		// Relative xpath
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("admin");
	
		// Xpath
		//*[@id="txtUsername"] - relative xpath - this will work and recommended
		///html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input - absolute xpath - will not work if there are any changes
		// in other web components.
		
		// css: #txtUsername
		
		Thread.sleep(3000);
		
		//driver.findElement(By.cssSelector("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		

		Thread.sleep(3000);
		
		// Linktext
		// --equals method: exact match  //a[text()= 'Forgot your password?'] - this is recommended
		// --contains method: partial match //a[contains(text(),'password')] - not recommended
		
		//driver.findElement(By.xpath("//a[text()= 'Forgot your password?']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		
		//Dynamic url
		
		// text = Reset Password Vinitha
		// a[text() = 'Reset Password Vinitha']
		// a[contains(text(), 'Reset Password']	
		
		// Reset Password kathyani
		
		// Clicking on an element but the page is not loading
	
		
	}

}
