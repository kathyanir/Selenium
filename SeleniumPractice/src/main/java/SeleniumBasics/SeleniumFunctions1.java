package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFunctions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// driver.get("http://output.jsbin.com/osebed/2");

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		System.out.println(driver.getTitle());

		System.out.println((driver.getPageSource()));

		System.out.println((driver.getCurrentUrl()));

		System.out.println(driver.getWindowHandle());

		System.out.println(driver.getWindowHandles());

		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

		driver.findElement(By.id("menu_admin_viewAdminModule")).click();

		driver.findElement(By.id("menu_admin_Qualifications")).click();

		WebElement dropdown = driver.findElement(By.id("menu_admin_Qualifications"));

		Select dropdownselect = new Select(dropdown);

		//System.out.println(dropdownselect);

		// dropdownselect.selectByIndex(0);
		// dropdownselect.selectByIndex(1);

		dropdownselect.selectByIndex(1);

		// dropdownselect.selectByValue("Skills");

		// driver.quit();
	}

}
