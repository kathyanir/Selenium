package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethod {
	
	
		 @Test()
		  public void login() {
			  System.out.println("Test Case 1");
		  }
		  
		  @Test(dependsOnMethods="login")
		  public void search() {
			  System.out.println("Test Case 2");
			  //Assert.assertEquals("abc", "abc");
			  Assert.assertEquals("abc", "xyz");
		  }
		  
		  @Test(dependsOnMethods="search", alwaysRun = false)
		  public void logout() {
			  System.out.println("Test Case 3");
		  }


}