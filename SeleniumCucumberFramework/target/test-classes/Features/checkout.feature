Feature: Checkout Process

  Scenario: User can purchase a backpack
    Given I am on the SauceDemo login page
    When I enter username "standard_user" and password "secret_sauce"
    And I click on the login button
    When I add the "Sauce Labs Backpack" to the cart
    And I click on the shopping cart icon
    And I click on the checkout button
    When I enter shipping information "John", "Doe", and "12345"
    And I finish the order
    Then I should see the order confirmation message "Thank you for your order!"