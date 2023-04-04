Feature: NopCommerce Register
  Background:
    Given User able to open Browser
    And Enter Url


    Scenario: NopCommerce Valid Register Test
      When User click on Register Link
      And User click on Gender Female
      And I have entered a First Name
      And I have entered a Last Name
      And I have entered a Date of Birth
      And I have entered a Email
      And I have entered a Company name
      And I have entered a Password
      And I have entered a Confirm password
      And I click on Register button


