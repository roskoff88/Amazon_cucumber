$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AmazonSpec.feature");
formatter.feature({
  "line": 4,
  "name": "validate Amazon site is working",
  "description": "",
  "id": "validate-amazon-site-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@AmazonTest"
    }
  ]
});
formatter.before({
  "duration": 1388547708,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "validating Amazon site is available",
  "description": "",
  "id": "validate-amazon-site-is-working;validating-amazon-site-is-available",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I have the current Amazon url",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I open the Amazon url",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Amazon page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Validate Amazon page title",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionTest.i_have_the_current_Amazon_url()"
});
formatter.result({
  "duration": 76803558,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionTest.i_open_the_Amazon_url()"
});
formatter.result({
  "duration": 34028470323,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionTest.Amazon_page_should_be_displayed()"
});
formatter.result({
  "duration": 7661445,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionTest.Validate_Amazon_page_title()"
});
formatter.result({
  "duration": 7096670,
  "status": "passed"
});
formatter.after({
  "duration": 103685451,
  "status": "passed"
});
formatter.before({
  "duration": 1812546805,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "validating search products",
  "description": "",
  "id": "validate-amazon-site-is-working;validating-search-products",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I have the current Amazon url",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I have a valid Amazon product",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I open the Amazon url",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I search a valid product",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Amazon page should displayed the product",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionTest.i_have_the_current_Amazon_url()"
});
formatter.result({
  "duration": 123558,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionTest.i_have_a_valid_Amazon_product()"
});
formatter.result({
  "duration": 66455,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionTest.i_open_the_Amazon_url()"
});
formatter.result({
  "duration": 15244195170,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionTest.i_search_a_valid_product()"
});
formatter.result({
  "duration": 11194969434,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionTest.amazon_page_should_displayed_the_product()"
});
formatter.result({
  "duration": 36232133,
  "status": "passed"
});
formatter.after({
  "duration": 103686624,
  "status": "passed"
});
});