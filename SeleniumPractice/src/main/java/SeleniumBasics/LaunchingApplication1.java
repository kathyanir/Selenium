package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchingApplication1 {
	
	public static void main(String args[]){
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[1]/a")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[2]/input[1]")).sendKeys("Hannah Flores");
		
		//*[@id="systemUser_userName"]
	
		
		driver.findElement(By.id("systemUser_userName")).sendKeys("dv1234567");
		
		//*[@id="systemUser_password"]
		
		driver.findElement(By.id("systemUser_password")).sendKeys("Dv12345*");
		
		//*[@id="systemUser_confirmPassword"]
		
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Dv12345*");
		
		driver.findElement(By.id("btnSave")).click();
		
		
		//*[@id="welcome-menu"]/ul/li[2]/a
		
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[9]/ul/li[2]/a")).click();
		
		//*[@id="welcome-menu"]/ul/li[2]/a
		
	//	driver.findElement(By.id(""welcome-menu"/ul/li[2]/a"").
		
		/*
		
		// a html tag is used to get the urls
		List<WebElement> urls = driver.findElements(By.tagName("a"));
		
		int count = urls.size();
		System.out.println(count);
		
		for(int i=0; i < urls.size(); i++) {
			
			System.out.println(urls.get(i).getText());
			
		}

		 */
		
		// close or quit
		driver.quit();
		//driver.close();
		
		
		
	}

}
