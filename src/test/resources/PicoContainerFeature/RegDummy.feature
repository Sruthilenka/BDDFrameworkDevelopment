Feature: Registration Page check1

  Scenario: Register the user with valid credentials1
    Given I am on the registration page1
    When I entered the valid credentials1
      | firstName | lastName | email                  |
      | Sruthi    | Lenka    | lenka.sruthi@gmail.com |
    And I submit the registration form1
    Then I should see a success message1
