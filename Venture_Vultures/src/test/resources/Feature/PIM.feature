 Feature: Acessing the new user

  Scenario Outline: Adding new user in PIM
    Given User is on the Website homepage
    When User enters the valid username and password
    And User clicks the login button
    And User select the pim feature
    And Select the add employee category
    And User fills the add employee details using sheetname "<sheetname>" and rownumber <rownumber>
    Then User is able to see the new employee added details
    
       Examples: 
      | sheetname | rownumber |
      | sheet1    |         0 |