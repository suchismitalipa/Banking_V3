Feature: Customer

Background: below are the steps for each scenario 
	Given user launch Chrome browser
	When User opens URL "https://admin-demo.nopcommerce.com/login" 
	And user enters email as "admin@yourstore.com" and password as "admin"
	And Click on  login
	Then User can view the dashboard
@sanity
Scenario: Add a customer
	When user click on customers menu
	And user click on customers menu item
	And click on add new customer page
	When user enter customer info
	And click on save button 
	Then user can view confirmation message "the new user has been added successfully"
	And Close browser
@regression	
Scenario: Search Customer by EmailID
	When user click on customers menu
	And user click on customers menu item
	And Enter customer Email
	When click on search btton
	Then user should found email in the search table
	And Close browser