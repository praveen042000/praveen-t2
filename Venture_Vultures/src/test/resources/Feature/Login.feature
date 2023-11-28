Feature: Login an account in user website

  Background: 
    Given User is on the Website homepage

  @ValidCredentials
  Scenario: Login with valid credentials
    When User enters the valid username and password
    And User clicks the login button
    Then User sees the login successful message

  @InvalidCredentials
  Scenario Outline: Login with invalid credentials
    When User enters the invalid username "<username>"
    And User enters the invalid password "<password>"
    And User clicks the login button
    Then Login is unsuccessful with error messages

    Examples: 
      | username | password |
      | Admin1   | admin1   |

  | admin123 | admin    |
  | Aaddm    | min123   |