@completeTest
Feature: TEK Retail Application Signin feature

  Background: 
    Given user is on retail website
    When User click on Sign in option

  Scenario: Verify user can sign in into Retail Application
    And User enter email 'tuvshinbayar.surenkhorloo@tekschool.us' and password 'Example123456'
    And User click on login button
    Then User should be logged into Account

  Scenario Outline: Verify user can sign in into Retail Application
    And User enter email 'tuvshinbayar.surenkhorloo@tekschool.us' and password 'Example123456'
    And User click on login button
    Then User should be logged into Account

    Examples: 
      | email                  | password     |
      | transformers@gmail.com |       123456 |
      | tekSchool@yahoo.com    | qwerty       |
      | tester@hotmail.com     | qwerty123456 |

  @registerTest
  Scenario: Verify user can create an account into retail Website
    And User can click on Create new account button
    And User fill the signUp information with the below data
      | name     | email | password  | confirmPassword |
      | fullName | email | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into new Account
