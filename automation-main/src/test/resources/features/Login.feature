Feature: Login to SauceDemo

  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User enters valid username and password
    And User clicks the login button
    Then User should be on the products page
    And User should see the product list

  Scenario: Negative case - Login with invalid credentials
    Given User is on the login page
    When User enters invalid username and password
    And User clicks the login button
    Then User should see an error message
