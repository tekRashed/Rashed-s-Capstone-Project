Feature: Sign In Feature


    

  @signInTest
  Scenario: Verify user can sign in into Retail Application
 	 Given User is on retail website
    When User click on Sign in option
    And User enter email 'raja@email.com' and password 'Raja@123'
    And User click on login button
    Then User should be logged in into Account
    
    
    @signUpTest
  Scenario Outline: Verify user can create an account into Retail Website
  Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
    | name | email           | password  | confirmPassword |
    | rajah | rajah@email.com | Rajah@1234 | Rajah@1234       |
    And User click on SignUp button
    Then User should be logged into account page
