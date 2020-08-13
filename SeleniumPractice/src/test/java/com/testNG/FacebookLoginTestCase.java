package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginTestCase {

	WebDriver driver;

	@BeforeMethod
	public void launchApp() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/careers/jobs/2771859126381287/");

	}

	@Test(description = "Facebook Login", priority = 1)
	public void loginToApp() {

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("kathyanir@gmail.com");
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("daddy15*");
		driver.findElement(By.id("u_0_4")).click();

	}

	/*
	@Test(description = "Register Page", priority = 2)
	public void registerpage() {
		// driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();

		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		;

		driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();

		driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();

	}
	
	
	*/

	@AfterMethod
	public void closeApp() {

		driver.getTitle();
		driver.close();

	}

}
