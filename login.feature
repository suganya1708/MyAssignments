Feature: Leaftaps page user authentication 

Scenario: Successful login with valid credentials
Given user is in login page
When the user enters username as demosalesmanager
And the user enters password as crmsfa
And user clicks login button
Then user navigated to welcome page
And the user see welcome message

Scenario: Failed Login with invalid crenditals
Given the user in on the login page
When the user enters username as demosalesmanager
And the user enters password as crms
And the user clicks the login button
But the user should not to redirected to welcome page