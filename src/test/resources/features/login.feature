#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template



Feature: Test Environment Retail Page
 
Background: 
	 Given User is on test environment homepage
   When User click on my account button
   
@login
Scenario: Login To Test Environment Retail Page
    Then User click on login button
    Then user enter username and password
    Then User click on login button to log in the page
 
 Scenario Outline: Title of your scenario outline
    Then user click on login button
    Then user enter username '<username>' and password '<password>'
    Then user click on login button to login to the page

Examples: 
    | username | password |
    | eagles@tekschool.us | eagles  |
		| hawks@tekschool.us  | hawks   |
		| falcons@tekschool.us| falcons |
    