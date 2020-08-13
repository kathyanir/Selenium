package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		int framesize = frames.size();
		
		System.out.println("Frame size is " + framesize);
		
		for (WebElement webElement : frames) {
			
			System.out.println(webElement);
			System.out.println(webElement.getText());
			System.out.println(webElement.getAttribute("id"));
			
			//driver.switchTo().frame(webElement.);
				
		}
		
		// Switch to a frame and perform an action
	
		int hashcode = driver.switchTo().frame("a077aa5e").hashCode();
		
		System.out.println("Hashcode " + hashcode);

	}

}
