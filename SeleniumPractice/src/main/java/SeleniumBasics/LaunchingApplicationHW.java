package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApplicationHW {
	
	public static void main (String args[]) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("testemail");
		driver.findElement(By.id("pass")).sendKeys("pass");
		//driver.findElement(By.id("u_0_b")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("test");
		
		//*[@id="u_0_r"]
		driver.findElement(By.id("u_0_r")).sendKeys("1111111");
		
	}
	

}
