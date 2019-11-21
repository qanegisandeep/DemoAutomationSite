package com.qa.shopping.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.shopping.factory.TLDriverFactory;
import com.qa.shopping.pages.LandingPage;
import com.qa.shopping.testBase.TestBase;

public class LandingPageTests extends TestBase{
	WebDriver driver;
	LandingPage landingPage;
	
	@Test
	public void verifySignInLinkTest() {
		landingPage = new LandingPage(TLDriverFactory.getTLDriver());
		Assert.assertTrue(landingPage.isSignInLinkPresent(), "SignIn Link not Present");
	}

	@Test
	public void verifyContactUsInLinkTest() {
		landingPage = new LandingPage(TLDriverFactory.getTLDriver());
		Assert.assertTrue(landingPage.isContactUsLinkPresent(), "ContactUs Link not Present");
	}
	
}
