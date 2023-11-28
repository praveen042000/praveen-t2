Feature: Trying to add new organization structure to orangeHRM

  Scenario Outline: Adding new Organaization Structure
    Given User is on the Website homepage
    When User enters the valid username and password
    And User clicks the login button
    And User clicks admin feature
    And user selects Organization category
    And User selects Structure in organaization category
    And User enables Edit function
    And User clicks Add button
    And User enters unit identification using sheetname "<sheetname>" and rownumber <rownumber>
    And user clicks save
    Then User should be able to see structure added sucessfully
    
        Examples: 
      | sheetname | rownumber |
      | sheet1    |         0 |
