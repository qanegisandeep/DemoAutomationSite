package com.qa.shopping.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.shopping.factory.TLDriverFactory;
import com.qa.shopping.utilities.ElementUtilities;

public class SignInPage extends TLDriverFactory{

	WebDriver driver;
	ElementUtilities elementUtilities;
	
	By email = By.id("email");
	By password = By.id("passwd");
	By signInButton = By.id("SubmitLogin");
	By forgotPassword = By.xpath("//a[text()='Forgot your password?']//parent::p");
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
		elementUtilities = new ElementUtilities(driver);
		elementUtilities.waitForTitlePresent("Login - My Store", 20);
	}
	
	public HomePage doLogin() {
		elementUtilities.doSendKeys(email, "sandeep.negi@splashmath.com");
		elementUtilities.doSendKeys(password, "graphic");
		elementUtilities.doClick(signInButton);
		return new HomePage(driver);
	}
	public String getSignInPageTitle() {
		return elementUtilities.getPageTitle();
	}
	
	public boolean forgotPasswordLink() {
		elementUtilities.waitForElementPresent(forgotPassword, 20);
		return elementUtilities.isElementVisible(forgotPassword);
	}
	
}
