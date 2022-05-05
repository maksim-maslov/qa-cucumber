Feature: I want to test login

  Scenario: I want to login with correct creds
    Given I go to main page
    When I login as "test" with email "test@test.ru"
    Then I should see the client name "test"