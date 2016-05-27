package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;;


public class AmazonHomePage {
	
	public static WebDriver aDriver;
	
	private final static String SELECTOR_SEARCH_BOX = "twotabsearchtextbox";
	
	//CONSTRUCTOR
	/**
	* Page Constructor used instead of PageFactory since we use Fluent Selenium
	 * @param driver, a WebDriver object
	 */
	public AmazonHomePage(WebDriver driver){
		aDriver = driver;
		
	}

	//LOCATORS
	public WebElement searchBox(){
		return aDriver.findElement(By.id(SELECTOR_SEARCH_BOX));
	}
	
	/**
	 * Performs a simple Google search
	 */
	public void Search(String searchQ){
		this.searchBox().sendKeys(searchQ);
		this.searchBox().submit();
	}
}
