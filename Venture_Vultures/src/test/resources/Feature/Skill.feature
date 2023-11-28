Feature: Login an account in user website

  Scenario Outline: Adding new skill
    Given User is on the Website homepage
    When User enters the valid username and password
    And User clicks the login button
    And User clicks admin feature
    And user select the qualification category
    And user select the add skills category
    And user enter the details using sheetname "<sheetname>" and rownumber <rownumber> 
    And user click save button
    Then user is able to see the added skilled details

    Examples: 
      | sheetname | rownumber |
      | sheet1    |         0 |