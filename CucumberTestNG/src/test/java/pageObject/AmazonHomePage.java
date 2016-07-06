package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {
	
	public static WebDriver aDriver;
	
	//SELECTOR STRINGS
	private static final String SELECTOR_SEARCH_BOX = "twotabsearchtextbox";
	
	
	/**
	* Page Constructor used instead of PageFactory since we use Selenium
	 * @param driver, a WebDriver object
	 */
	public AmazonHomePage(WebDriver driver){
		aDriver = driver;
	}

	//Locator
	public WebElement searchBox(){
		return aDriver.findElement(By.id(SELECTOR_SEARCH_BOX));
	}
	
	/**
	 * Performs a search for a product at Amazon
	 */
	public void Search(String productName){
		this.searchBox().sendKeys(productName);
		this.searchBox().submit();
	}
}
