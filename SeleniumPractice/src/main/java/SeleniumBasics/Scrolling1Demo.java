package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.get("http://output.jsbin.com/osebed/2");

		// get method will go to the url and wait for the page to load
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

		driver.findElement(By.id("menu_admin_viewAdminModule")).click();

		driver.findElement(By.id("menu_admin_UserManagement")).click();

		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();

		JavascriptExecutor jsexec = (JavascriptExecutor) driver;

		// a[contains(text(),'Virvaroi.Sebastian')]

		WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Virvaroi.Sebastian')]"));

		jsexec.executeScript("window.scrollBy(0, 1000)"); // Scroll by 1000
														 // pixels down - it will not reach until the end of the page
		// parameters - x axis and y axis
		// If x axis is negative then it scrolls to the left and vice versa
		// If y axis is positive it scrolls down and vice versa
		
		jsexec.executeScript("window,scrollTo(0, document.body.scrollHeight)"); // this will scroll till the end
		
		jsexec.executeScript("arguments[0].scrollIntoView(true);", target); // scrolls until it reaches the target
		
		
		/*HW - Directlly enter the date as in the Calendar
		 * Click on the Calendar icon and then select the month and year from the dropdown and select a date - use select class for selecting month and year
		 */
		
		
		

	}

}
