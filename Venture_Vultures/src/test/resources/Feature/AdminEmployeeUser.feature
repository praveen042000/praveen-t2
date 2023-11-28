Feature: Entering the Employee details

  Scenario: Adding Employee Status
    Given User is on the Website homepage
    When User enters the valid username and password
    And User clicks the login button
    And User clicks admin feature
    And User selects Job
    And User selects Employee Status
    And User Clicks on Add button
    And User Enters the Employee Status
    And User Clicks on Save button
    Then User Recevices Successfully Saved message
