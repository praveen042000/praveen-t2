Feature: Login an account in user website

  Scenario Outline: Adding new customer to project info
    Given User is on the Website homepage
    When User enters the valid username and password
    And User clicks the login button
    When user selects the time feature
    When user selects the projectinfo category
    When user selects the customer option
    When user clicks the add button
    When user adds the addcustomer name, description, and clicks the save button
    Then user sees the added customer details
