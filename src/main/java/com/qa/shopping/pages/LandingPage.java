package com.qa.shopping.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.shopping.factory.TLDriverFactory;
import com.qa.shopping.utilities.ElementUtilities;

public class LandingPage extends TLDriverFactory{

	WebDriver driver;
	ElementUtilities elementUtilities;
	
	By signInLink = By.className("login");
	By contactUsLink = By.linkText("Contact us");
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		elementUtilities = new ElementUtilities(driver);
		elementUtilities.waitForTitlePresent("My Store", 20);
		
	}
	
	public boolean isSignInLinkPresent() {
		return elementUtilities.isElementVisible(signInLink);
	}
	
	public boolean isContactUsLinkPresent() {
		return elementUtilities.isElementVisible(contactUsLink);
	}
	
	
	public void clickSignInLink() {
		elementUtilities.doClick(signInLink);
	}
	
	public SignInPage goToSignInPage() {
		clickSignInLink();
		elementUtilities.waitForTitlePresent("Login - My Store", 20);
		return new SignInPage(driver);
	}
	
}
