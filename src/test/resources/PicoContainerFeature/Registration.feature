Feature: Registration Page check

  Scenario: Register the user with valid credentials
    Given I am on the registration page
    When I entered the valid credentials
      | firstName | lastName | email                  |
      | Sruthi    | Lenka    | lenka.sruthi@gmail.com |
    And I submit the registration form
    Then I should see a success message
