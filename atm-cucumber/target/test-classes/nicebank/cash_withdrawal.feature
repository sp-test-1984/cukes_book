Feature: cash withdrawal
    Scenario: Successful withdrawal from account in credit
        Given my account has been credited with $100.00
        When I request $20
        Then $20 should be dispensed
        And the balance of my account  should be $80.00
