
Feature: verify checkout functionality

 @reg
  Scenario: checkout functionality with valid details
    When enter valid username "standard_user" and valid password "secret_sauce"
    And click on login button
    And click on add to cart
    And click on basket
    And click on checkout
    And enter first name "Laxman" last name "Singh" and zipcode "262553"
    And click on Continue button 
    And click on finish button
    Then validate checkout text
    
    #negative testcases
    @reg
    Scenario: checkout functionality by giving only fisrtname and lastname
    When enter valid username "standard_user" and valid password "secret_sauce"
    And click on login button
    And click on add to cart
    And click on basket
    And click on checkout
    And enter first name "Laxman" last name "Singh" and zipcode ""
    And click on Continue button 
    Then validate error message without giving zipcode
    
    @reg
    Scenario: checkout functionality by giving only fisrtname and zipcode
    When enter valid username "standard_user" and valid password "secret_sauce"
    And click on login button
    And click on add to cart
    And click on basket
    And click on checkout
    And enter first name "Laxman" last name "" and zipcode "12345"
    And click on Continue button 
    Then validate error message without giving lastname
    
     @reg
    Scenario: checkout functionality by giving only fisrtname and zipcode
    When enter valid username "standard_user" and valid password "secret_sauce"
    And click on login button
    And click on add to cart
    And click on basket
    And click on checkout
    And enter first name "" last name "singh" and zipcode "12345"
    And click on Continue button 
    Then validate error message without giving firstname

 @reg
    Scenario: checkout functionality by giving only fisrtname and zipcode
    When enter valid username "standard_user" and valid password "secret_sauce"
    And click on login button
    And click on add to cart
    And click on basket
    And click on checkout
    And enter first name "" last name "" and zipcode ""
    And click on Continue button 
    Then validate error message without giving any input
   
