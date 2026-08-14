
@tag
Feature: Purchase the order from Ecommerce Website

	Background:
	Given I landed on Ecommerce Page
	
	@Regression
	Scenario Outline: Positive test of submitting the order
		Given Logged in with username <name> and password <password>
		When I add the product <productName> from the cart
		And Checkout <productName> and submit the order
		Then "THANKYOU FOR THE ORDER." message is displayed on confirmation page
		
		Examples:
			| name | password | productName |
			| test4allcheck@gmail.com | tpchkLpa&3974 | ZARA COAT 3 |
 