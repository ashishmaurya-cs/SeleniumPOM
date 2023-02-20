package com.ashish.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	WebDriver driver = null;

	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchText = By.name("q");
	By searchButton = By.name("btnK");
	
	
	public void setTextSearchBox(String text) {
		driver.findElement(searchText).sendKeys(text);
	}
	
	public void clickButton() {
//		driver.findElement(searchButton).sendKeys(Keys.RETURN);
	}
	

}
