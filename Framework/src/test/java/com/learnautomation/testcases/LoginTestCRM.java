package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.BrowserFactory;

public class LoginTestCRM extends BaseClass {
	
		
	
	
	@Test(priority = 1)
	public void loginApp() {
		
		Reporter.log("From Reporter.log >>> Testcase1 - LoginApp"	);
		
		logger = report.createTest("Login to CRM");
		
		logger.info("Application starting up");
		
		String expTitle = "#1 Free CRM customer relationship management software cloud";
		
		System.out.println("Window Title = " + driver.getTitle());
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expTitle, ">>> Didn't match");
		
		logger.pass("Initial page load successful");
			
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Application successfully logged in...");
		
		loginPage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		
		
	}
	
	
/*	@Test(priority = 2)
	public void loginApp2() {
		
		logger = report.createTest("Login to CRM");
		
		logger.info("Application starting up");
		
		String expTitle = "#1 Free CRM customer relationship management software cloud";
		
		System.out.println("Window Title = " + driver.getTitle());
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expTitle, ">>> Didn't match");
		
		logger.pass("Initial page load successful");
			
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Application successfully logged in...");
		
		loginPage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		
		
	}*/

}
