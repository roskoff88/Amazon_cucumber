package pageObject;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	private WebDriver aDriver;
	
	/*
	* Page Constructor 
	 * @param driver, a WebDriver object
	*/
	public BasePage(WebDriver driver) {
		this.aDriver = driver;
	}

	/*
	* Method which returns the page title of the page object as a String
	 * @Return String
	*/
	public String getPageTitle(){
		return this.aDriver.getTitle();
	}
}
