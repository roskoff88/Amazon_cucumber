package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	//SELECTOR STRINGS
	private static final String SELECTOR_SEARCH_BOX = "twotabsearchtextbox";
	
	//Locator
	@FindBy(id=SELECTOR_SEARCH_BOX)
	private WebElement searchBox;
	
	/**
	* Page Constructor 
	 * @param driver, a WebDriver object
	 */
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * Performs a search for a product at Amazon
	 */
	public void SearchFor(String productName){
		searchBox.sendKeys(productName);
		searchBox.submit();	
	}
}
