
Feature: Your Cart functionality

  @reg
  Scenario: Verify remove button functionality
    When enter valid username "standard_user" and valid password "secret_sauce"
    And click on login button
    And Add two item on basket
    And click on basket
    And remove one item from basket
    Then validate remove button functionality   