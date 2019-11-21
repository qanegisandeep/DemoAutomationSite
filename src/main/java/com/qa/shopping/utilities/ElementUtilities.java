package com.qa.shopping.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtilities {
	
	WebDriver driver;
	
	public ElementUtilities(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return element;
	}
	
	public void doClick(By locator) {
		try {
			isElementVisible(locator);
			getElement(locator).click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void doSendKeys(By locator, String value) {
		try {
			isElementVisible(locator);
			getElement(locator).sendKeys(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public boolean isElementVisible(By locator) {
		try {
			return getElement(locator).isDisplayed();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}	
	}
	
	public String getPageTitle() {
		try {
			return driver.getTitle();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public void waitForElementPresent(By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver ,time);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void waitForElementVisible(By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver ,time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void waitForTitlePresent(String title, int time) {
		WebDriverWait wait = new WebDriverWait(driver ,time);
		wait.until(ExpectedConditions.titleContains(title));
	}

}
