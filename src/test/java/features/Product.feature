

Feature: Add to cart functionality
@reg
Scenario: validate count after adding one item on cart
    When enter valid username "standard_user" and valid password "secret_sauce"
    And click on login button
    And click on add to cart
    Then validate count of item
    
  @reg
Scenario: validate count after adding two item on cart
    When enter valid username "standard_user" and valid password "secret_sauce"
    And click on login button
    And Add two item on basket
    Then validate count of item after adding two item  
    
  @reg
Scenario: add product on cart
    When enter valid username "standard_user" and valid password "secret_sauce"
    And click on login button
    And click on add to cart
    And click on basket
    And click on checkout
    Then validate text
    
   @reg
Scenario: validate size of list in filter 
    When enter valid username "standard_user" and valid password "secret_sauce"
    And click on login button
    And click on filter dropdown
    Then validate size of  list in filter dropdown
    
   @reg    
Scenario: validate text in filter options
    When enter valid username "standard_user" and valid password "secret_sauce"
    And click on login button
    Then validate text of all option in filter dropdown
    
    @test
Scenario: Verify presence of all menu elements
    When enter valid username "standard_user" and valid password "secret_sauce"
    And click on login button
    And click on hamburger icon
    Then validate presence of all item in menu
