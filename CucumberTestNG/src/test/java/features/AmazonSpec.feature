
@AmazonTest

Feature: validate Amazon site is working
  
 
  Scenario: validating Amazon site is available
    Given I have the current Amazon url
    When I open the Amazon url
    Then Amazon page should be displayed
    Then Validate Amazon page title

  Scenario: validating search products
    Given I have the current Amazon url
    Given I have a valid Amazon product
    When I open the Amazon url
    When I search a valid product
    Then Amazon page should displayed the product