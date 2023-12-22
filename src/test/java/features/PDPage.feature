Feature: Add to cart functionality in PDP 
@test
Scenario: validate count after adding an item from PDP side
    When enter valid username "standard_user" and valid password "secret_sauce"
    And click on login button
    And click on element name 
    And click on add to cart from pdp side
    Then validate count of basket