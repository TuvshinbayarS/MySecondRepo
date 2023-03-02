@completeTest
Feature: Retail application account feature

  Background: 
    Given user is on retail website
    When User click on Sign in option
    And User enter email 'tuvshinbayar.surenkhorloo@tekschool.us' and password 'Example123456'
    And User click on login button
    Then User should be logged into Account

  Scenario: verify user can update profile information
    When User click on account option
    And User update Name 'Joker' and Phone '2026667788'
    And User click on update button
    Then User profile information should be updated

  @addAddress
  Scenario: Verify user can add an address
    When User click on account option
    And User click on Add address option
    And User fill new address with below information
      | country | fullName | phoneNumber | streetAddress | apt | city | state | zipCode |
    And User click add your address button
    Then a message shoud be displayed "Address Added Successfully"
