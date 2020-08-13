package SeleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchAlertsFramesWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Maximises the browser window

		driver.manage().window().maximize();

		driver.get("http://www.seleniumframework.com/Practiceform/");

		//Thread.sleep(10000);

		// Handling an alert
		//driver.findElement(By.id("alert")).click();

		//driver.switchTo().alert().accept();

		// Click the first button New browser window
		driver.findElement(By.id("button1")).click();

		System.out.println(driver.getTitle());

		String parentWindow = driver.getWindowHandle();

		System.out.println(" Parent window is " + parentWindow);

		Set<String> total_num_of_windows = driver.getWindowHandles();
		
		System.out.println(" Total num of windows is " + total_num_of_windows);
		
		String childWindow = null;

		for (String string : total_num_of_windows) {

			//System.out.println(" All the windows " + string.valueOf(total_num_of_windows));
			

			if ((string.equals(parentWindow))) {

				System.out.println(" Parent window is " + parentWindow);
			}
			else {
				
				childWindow = string;
				
			}

		}

		System.out.println("Child window is " + childWindow);
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getTitle());
		
		driver.close(); // Closes the browser window so that code is clean
        
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getTitle());
		
		// Use this to get back to the main frame
	    //driver.switchTo().defaultContent();
	    
	    
	    // Click the button New browser tab
	    
	    driver.findElement(By.xpath("//button[contains(text(),'New Browser Tab')]")).click();
	    
	    System.out.println(driver.getTitle());
	    

		Set<String> total_num_of_windows1 = driver.getWindowHandles();
		
		System.out.println(" Total num of windows is " + total_num_of_windows1);
		
		String childWindow1 = null;

		for (String string : total_num_of_windows1) {

			//System.out.println(" All the windows " + string.valueOf(total_num_of_windows));
			

			if ((string.equals(parentWindow))) {

				System.out.println(" Parent window is " + parentWindow);
			}
			else {
				
				childWindow1 = string;
				
			}

		}

		
		/*for (String string : total_num_of_windows1) {
			
			
			System.out.println(string.valueOf(total_num_of_windows1));
			
			
			
		}*/
	
	System.out.println("Child window is " + childWindow1);
	
	driver.switchTo().window(childWindow1);
	
	System.out.println(driver.getTitle());
	
	driver.close(); // Closes the browser window so that code is clean
    
	driver.switchTo().window(parentWindow);
	
	System.out.println(driver.getTitle());
	
	// Use this to get back to the main frame
  //  driver.switchTo().defaultContent();
    
    driver.close();
    
	}

	private static void content() {
		// TODO Auto-generated method stub
		
	}
	
}
	    
	    
	
	
		




