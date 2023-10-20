Feature: Shopping on SauceDemo

  Scenario: Add a product to the cart
    Given User is on the products page
    When User adds a product to the cart
    Then User should see the product in the cart

  Scenario: Remove a product from the cart
    Given User is on the products page
    And User has a product in the cart
    When User removes the product from the cart
    Then User should see an empty cart
