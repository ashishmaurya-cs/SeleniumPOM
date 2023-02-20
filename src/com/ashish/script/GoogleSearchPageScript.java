package com.ashish.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ashish.page.GoogleSearchPage;

public class GoogleSearchPageScript {
  WebDriver driver;
	
	public  void driverMethod() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		GoogleSearchPage object = new GoogleSearchPage(driver);
		object.setTextSearchBox("Selenium");
		object.clickButton();
		driver.close();
	}
	
	public static void main(String[] args) {
		new GoogleSearchPageScript().driverMethod();
	}
}
