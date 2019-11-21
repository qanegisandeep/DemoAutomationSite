package com.qa.shopping.testBase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.shopping.factory.TLDriverFactory;


public class TestBase {
	
	@Parameters(value={"browser"})
	@BeforeMethod
	public void setUpTest(String browserName) {
		TLDriverFactory.setTlDriver(browserName);
		TLDriverFactory.getTLDriver().get("http://automationpractice.com/");
		TLDriverFactory.getTLDriver().manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDownTest() {
		TLDriverFactory.getTLDriver().quit();
	}


}