Feature: Check money withdrawal of an account

  Scenario: Withdraw amount and check the balance
    Given I have an $200 in the account
    When I have withdrawn $50 from the account
    Then Money should be dispensed from the account
