Feature: This feature is used for testing UI of retail page

   Background: 
    Given user is on retail website
    When User click on Sign in option
    And User enter email 'tuvshinbayar.surenkhorloo@tekschool.us' and password 'Example123456'
    And User click on login button
    Then User should be logged into Account
 
 
  Scenario: Verify user can search a product
    Given user is on retail website
    When user search for "pokemon" product
    Then the product should be displayed

	@smokeTest
  Scenario: Verify shop be department sidebar
    Given user is on retail website
    When user click on all section
    Then below options are present in shop by department side bar
      | Electronics | Computers | Smart Home | Sports | Automative |
