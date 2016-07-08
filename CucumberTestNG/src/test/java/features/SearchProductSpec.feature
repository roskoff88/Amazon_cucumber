
@AmazonSearchProduct

Feature: validate search products at Amazon Site
 
  Scenario: validating valid search products
    Given I have the current Amazon url "https://www.amazon.com/"
    Given I have the Amazon product "pc"
    When I open the given Amazon page url
    Then The Amazon page should be displayed
    Then The Amazon page title is "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"
    When I search the given product
    Then The search product is displayed