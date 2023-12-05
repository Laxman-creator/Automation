
Feature: login functionality of swaglabs

 Scenario: login with valid details
    When enter valid username "standard_user" and valid password "secret_sauce"
    And click on login button
    Then validate login successfully
    

 
