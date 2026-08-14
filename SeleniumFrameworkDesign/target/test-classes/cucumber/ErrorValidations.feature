
@tag
Feature: Error Validation
	
	@ErrorValidation
	Scenario Outline: Positive test of submitting the order
		Given I landed on Ecommerce Page
		Given Logged in with username <name> and password <password>
		Then "Incorrect email or password." message is displayed
		
		Examples:
			| name | password |
			| test4allcheck@gmail.com | tpchkLpa&39745  |
 