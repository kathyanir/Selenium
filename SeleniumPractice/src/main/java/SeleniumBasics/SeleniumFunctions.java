package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Get Methods - driver.get, driver.getcurrenturl, driver.getpagesource,
		 * driver.getTitle, driver.getwindowhandle, driver.getwindowhandles
		 * Locating links - By.linktext, By.partiallinktext Dropdown - To handle
		 * this we use 'Select' class. First we identify the dropdown and we
		 * will work on individual options. Anything we see on the webpage is a
		 * webelement Handling iframes - Close and Quit methods FindElement and
		 * FindElements isEnabled
		 */

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// driver.get("http://output.jsbin.com/osebed/2");

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

		System.out.println(driver.getCurrentUrl());

		// driver.findElement(By.id("btnLogin"));

		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());

		// WebElement dropdown = driver.findElement(By.id("fruits")); // we will
		// get the
		// entire
		// dropdown

		// Select dropdown_select = new Select(dropdown); // converting our
		// webelement into a
		// select object inorder
		// to use the mechanism
		// of individual
		// elements

		/*
		 * dropdown_select.selectByIndex(0); dropdown_select.selectByIndex(2);
		 * 
		 * dropdown_select.selectByVisibleText("Apple");
		 * dropdown_select.selectByVisibleText("Grape");
		 */

		System.out.println("Hello");
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();

		driver.findElement(By.id("menu_admin_UserManagement")).click();

		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();

		boolean checkenabled = driver.findElement(By.id("ohrmList_chkSelectRecord_6")).isEnabled();

		System.out.println(checkenabled);

		System.out.println(driver.findElement(By.id("ohrmList_chkSelectRecord_6")).isDisplayed());
		
		System.out.println(driver.findElement(By.id("ohrmList_chkSelectRecord_6")).isSelected());

		// HW - use selectByvalue method and test for case sensitive

		driver.quit();

	}

}
