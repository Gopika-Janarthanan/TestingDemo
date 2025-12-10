Feature: Login page Automation of saucedemo App
Scenario: Check login is successful with valid creds
Given User is on login page
When User enters valid username and password
And Clicks on Login Button
Then User is navigating to Home Page
And Close the browser




