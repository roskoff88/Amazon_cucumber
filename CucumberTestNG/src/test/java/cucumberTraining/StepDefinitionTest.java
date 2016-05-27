package cucumberTraining;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.junit.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.AmazonHomePage;

public class StepDefinitionTest {
	
	private WebDriver driver = HooksTest.driver;
	
	private String baseURL = "http://www.amazon.com/";
	private String AmazonPageTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	private String validProduct = "cell phone";
	
	@Given("^I have the current Amazon url$")
	public void i_have_the_current_Amazon_url() throws Throwable {
		System.out.println("Amazon current url is: " + baseURL);	
	}

	@When("^I open the Amazon url$")
	public void i_open_the_Amazon_url() throws Throwable {
		driver.get(baseURL);
	}

	@Then("^Amazon page should be displayed$")
	public void Amazon_page_should_be_displayed() throws Throwable {
		  String currentUrl = driver.getCurrentUrl();
		  Assert.assertEquals(baseURL, currentUrl);
		  Reporter.log(" I have the correct url for Amazon site");
	}
	
	@Then("^Validate Amazon page title$")
	public void Validate_Amazon_page_title() throws Throwable {
		  String currentPageTitle =  driver.getTitle();
		  System.out.println("Amazon title is: " + driver.getTitle());
		  Assert.assertEquals(AmazonPageTitle, currentPageTitle);
		  Reporter.log(" I have the correct page title for Amazon site");
	}
	
	@Given("^I have a valid Amazon product$")
	public void i_have_a_valid_Amazon_product() throws Throwable {
		System.out.println("Amazon valid product is: " + validProduct);
	}
	
	@When("^I search a valid product$")
	public void i_search_a_valid_product() throws Throwable {
		AmazonHomePage page = new AmazonHomePage(driver);
		page.Search(validProduct);	
	
	}
	
	@Then("^Amazon page should displayed the product$")
	public void amazon_page_should_displayed_the_product() throws Throwable {

		Assert.assertEquals(driver.getTitle(),"Amazon.com: cell phone");
	}
}
