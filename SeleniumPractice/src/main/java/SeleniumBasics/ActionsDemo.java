package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/* Action class is a built in feature and is used to handle keyboard and mouse events.
 * 
 */

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.get("http://output.jsbin.com/osebed/2");

		// get method will go to the url and wait for the page to load
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		Actions actions = new Actions(driver);
		
		Action seriesofaction = actions.moveToElement(driver.findElement(By.id("txtUsername"))).click().keyDown(Keys.SHIFT).sendKeys("admin").keyUp(Keys.SHIFT).doubleClick().build();
		
		seriesofaction.perform();
		
		/*

		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

		// driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();

		

		actions.moveToElement(driver.findElement(By.xpath("//b[contains(text(),'Admin')]"))).build().perform();
		
		Thread.sleep(4000);

		actions.moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"))).build().perform();
		
		Thread.sleep(4000);
		
		actions.moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"))).build().perform();
		
		Thread.sleep(4000);
		*/

	}

}
