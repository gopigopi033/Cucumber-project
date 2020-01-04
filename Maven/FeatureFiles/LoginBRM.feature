Feature: This is login BRM feature
Scenario: To check valid login scenario
Given user is entering the login page
When the user enter the valid "sylix" and "admin"
And click on the login button
Then the user should be navigated to home page