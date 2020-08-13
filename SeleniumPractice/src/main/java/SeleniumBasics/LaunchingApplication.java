package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchingApplication {
	
	public static void main (String [] args) throws InterruptedException {
		
	
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		// WebDriverManager - downloads the drivers for you and links the path to your current project
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("testemail");
		driver.findElement(By.id("pass")).sendKeys("pass");
		// driver.findElement(By.name("pass")).sendKeys("pass");
		driver.findElement(By.id("u_0_b")).click();
		
		//driver.quit();
		
	}	
	
}



