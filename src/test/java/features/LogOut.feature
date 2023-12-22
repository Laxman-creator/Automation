
Feature: verify logout functionality
@test
Scenario: Verify remove button functionality
    When enter valid username "standard_user" and valid password "secret_sauce"
    And click on login button
    And click on logout button
    Then validate logout successfully