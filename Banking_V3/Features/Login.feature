Feature: Login Action

Scenario: Successful login with valid credential
	Given user launch Chrome browser
	When User opens URL "https://admin-demo.nopcommerce.com/login" 
	And user enters email as "admin@yourstore.com" and password as "admin"
	And Click on  login
	Then Page Title should be "Dashboard/nopCommerce administration"
	When User click on logout link
	And Close browser
	
Scenario Outline:Login Data driven
	Given user launch Chrome browser
	When User opens URL "https://admin-demo.nopcommerce.com/login" 
	And user enters email as "<email>" and password as "<password>"
	And Click on  login
	When User click on logout link
	And Close browser
	
	Examples:
		| email | password |
		|admin@yourstore.com | admin |
		|admin1@yourstore.com | admin123 |