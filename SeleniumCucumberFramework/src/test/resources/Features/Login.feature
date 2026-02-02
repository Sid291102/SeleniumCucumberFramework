Feature: Login and Logout Functionality

  Scenario: Successful logout from products page
    Given I am on the SauceDemo login page
    When I enter username "standard_user" and password "secret_sauce"
    And I click on the login button
    When I click on the menu button
    And I click on the logout link
    Then I should be redirected to the login page