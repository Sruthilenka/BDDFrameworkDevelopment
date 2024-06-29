Feature: Check SignInpage

  Scenario: Login to the account
    Given I am on the login page
    When I have given correct credentials
      | Email                  | Password |
      | lenka.sruthi@gmail.com | Password |
    And i click on Login button
    Then I should be loggedin succesfully
