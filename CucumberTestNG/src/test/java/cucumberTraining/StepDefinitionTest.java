package cucumberTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.junit.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.AmazonHomePage;

public class StepDefinitionTest {
	
	private static WebDriver driver = HooksTest.driver;
	
	private String baseURL = "";
	private String product = "";
	
	@Given("^I have the current Amazon url \"(.*)\"$")
	public void i_have_the_current_Amazon_url(String url) throws Throwable {
		Reporter.log(" Amazon current url is: " + url);
		this.baseURL = url;
	}

	@When("^I open the given Amazon page url$")
	public void i_open_the_Amazon_url() throws Throwable {
		driver.get(baseURL);
	}

	@Then("^The Amazon page should be displayed$")
	public void the_Amazon_page_should_be_displayed() throws Throwable {
		  Assert.assertEquals(baseURL, driver.getCurrentUrl());
		  Reporter.log(" I have the correct url for Amazon site");
	}
	
	@Then("^The Amazon page title is \"(.*)\"$")
	public void the_Amazon_page_title_is(String pageTitle) throws Throwable {
		  Assert.assertEquals(driver.getTitle(), pageTitle);
		  Reporter.log(" I have the correct page title for Amazon site");
	}
	
	@Given("^I have the Amazon product \"(.*)\"$")
	public void i_have_the_Amazon_product(String productName) throws Throwable {
		Reporter.log("Amazon product name is: " + productName);
		this.product = productName;
	}
	
	@When("^I search the given product$")
	public void i_search_the_given_product() throws Throwable {
		AmazonHomePage page = new AmazonHomePage(driver);
		page = PageFactory.initElements(driver, AmazonHomePage.class); 
		page.SearchFor(this.product);	
	}
	
	@Then("^The search product is displayed$")
	public void the_search_product_is_displayed() throws Throwable {
		Reporter.log("Asserting the product name displayed at the page title...");
		Assert.assertEquals(driver.getTitle(),"Amazon.com: " + this.product);
	}
}
