package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLoginTestCase {

	WebDriver driver;

	@BeforeMethod
	public void launchApp() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}

	@Test(description = "OrangeHRM Login", priority = 1)
	public void loginToApp() {

		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

	}

	@Test(description = "Admin Page", priority = 2)
	public void adminPage() {
		//driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
		
		//driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();

		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();

		
		//driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();

	//	driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
		
	}

	@AfterMethod
	public void closeApp() {

		driver.getTitle();
		driver.close();

	}

}

/*
 * HW - Login to Facebook app , before method, after method, add test should
 * have login code and the next is the register page
 * 
 * 
 * 
 * 
 */
