package com.qa.shopping.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.shopping.factory.TLDriverFactory;
import com.qa.shopping.pages.LandingPage;
import com.qa.shopping.pages.SignInPage;
import com.qa.shopping.testBase.TestBase;

public class SignInPageTests extends TestBase {
	
	WebDriver driver;
	LandingPage landingPage;
	SignInPage signInPage;
	
	@Test
	public void verifyUserSignInPageTest() {
		landingPage = new LandingPage(TLDriverFactory.getTLDriver());
		signInPage = landingPage.goToSignInPage();
		System.out.println("Title = "+ signInPage.getSignInPageTitle());
		Assert.assertEquals(signInPage.getSignInPageTitle(), "Login - My Store", "User not on SignIn Page");
	}
	
	@Test
	public void verifyForgotPasswordLinkTest() {
		landingPage = new LandingPage(TLDriverFactory.getTLDriver());
		signInPage = landingPage.goToSignInPage();
		Assert.assertTrue(signInPage.forgotPasswordLink(), "Forgot Password link not present");
	}
}
