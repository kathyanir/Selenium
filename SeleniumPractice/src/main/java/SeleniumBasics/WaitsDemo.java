package SeleniumBasics;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Thread.sleep(4000); -- This is not recommended   - It will affect the performance of the code
		
		/* Implicit wait and Explicit wait 
		 * Implicit wait is applicable for all the elements - is mostly recommended
		 * Explicit wait is specific to an element - based on the conditions
		 * Fluent wait and drag/ drop and calendar - TODO for tomorrow
		 */
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		// driver.get("http://output.jsbin.com/osebed/2");

		// get method will go to the url and wait for the page to load
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
		WebElement element = driver.findElement(By.name("Submit"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Submit"))).click();
		
		// Fluent wait
		/*
		 * This is used when we have to define a maximum time for the web driver to wait for an element.
		 * We can also define frequency
		 * 1. Time out - Maximum time
		 * 2. Polling - Frequency
		 * 3. Ignoring few exceptions
		 */ 
		
		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
      
		
		

	}

}
