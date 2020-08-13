package SeleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.seleniumframework.com/Practiceform/");

		driver.findElement(By.id("button1")).click();

		System.out.println(driver.getTitle());

		// Window handles is used to switch between windows

		String mainWindow = driver.getWindowHandle(); // This will return the
														// handle of the current
														// window
		
		System.out.println(" Parent window is " + mainWindow);

		Set<String> windows = driver.getWindowHandles();
		
		String childWindow = null;
		
		for (String string : windows) {
			
			//System.out.println(string);
		    
			if (!(string.equals(mainWindow))){
				
				childWindow = string;
				
			}
			
		}
		
		System.out.println("Child Window is " + childWindow);
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(mainWindow);
		
		System.out.println(driver.getTitle());
		
		// Use this to get back to the main frame
	    driver.switchTo().defaultContent();
		
		driver.quit();
		
		
		// HW - Try to handle alert in the website that we worked on today and also try to click multiple windows and perform some operation 
		// and try to use driver.close() feature
		// validate if driver.close() is working as expected
		



	}

}
