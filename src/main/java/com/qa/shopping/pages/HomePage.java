package com.qa.shopping.pages;

import org.openqa.selenium.WebDriver;

import com.qa.shopping.factory.TLDriverFactory;
import com.qa.shopping.utilities.ElementUtilities;

public class HomePage extends TLDriverFactory{

	WebDriver driver;
	ElementUtilities elementUtilities;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
}
