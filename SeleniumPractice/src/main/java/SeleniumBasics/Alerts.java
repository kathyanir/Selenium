package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

			
			public static void main(String args[]){
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
				
				// First alert box
				driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
				// Handle the alert - Switch to alert where user can accept the alert
				driver.switchTo().alert().accept();
				
				// Second alert box
				//driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]")).click();
				// Handle the alert - Switch to alert where user can accept the alert
				//driver.switchTo().alert().accept();
				
				// Switch to alert where user can dismiss the alert]
				driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]")).click();
				driver.switchTo().alert().dismiss();
				
				// Third alert box
				driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
				// Switch to alert and enter something
				driver.switchTo().alert().sendKeys("Aashika my sweetie pie");
				driver.switchTo().alert().accept();
				
				// Third alert box
				driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
				// Switch to alert and enter something
				driver.switchTo().alert().sendKeys("Kathyani Ravindranath");
				driver.switchTo().alert().accept();
				
				//driver.quit();
				

	}

}
