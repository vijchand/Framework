package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	WebDriver driver;
	
	//this is new commit from Viji
	public LoginPage(WebDriver ldriver) {
		
		this.driver = ldriver;
		
	}
	
	@FindBy(xpath="//span[text()='Log In']") WebElement login;
	@FindBy(name="email") WebElement uname;
	@FindBy(name="password") WebElement pass;
	@FindBy(xpath="//div[text()='Login']") WebElement loginButton;
	
	public void loginToCRM(String usernameApplication, String passwordApplication) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		
		login.click();
		uname.sendKeys(usernameApplication);
		pass.sendKeys(passwordApplication);
		loginButton.click();
		
	}
}
