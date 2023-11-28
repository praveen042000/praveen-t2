Feature: Adding the leave reason

  Scenario Outline: Adding the leave details to the category
    Given User is on the Website homepage
    When User enters the valid username and password
    And User clicks the login button
    And User clicks the leave feature
    And user cliks to the configure to the field
    And user Creates new leave type using sheetname "<sheetname>" and rownumber <rownumber>
    Then user sees the adding the leave page switching
    
         Examples: 
      | sheetname | rownumber |
      | sheet1    |         0 |
