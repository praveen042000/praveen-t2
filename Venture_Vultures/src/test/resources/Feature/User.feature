Feature: Login an account in user website

  Scenario Outline: Checking User Status is Enabled or not
    Given User is on the Website homepage
    When User enters the valid username and password
    And User clicks the login button
    And User clicks admin feature
    And User the enters the username to Search
    And User the Clciks the savebutton
    Then User is Checking the Status of user is Enabled or not