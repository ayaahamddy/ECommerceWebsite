
Feature: SignUp : The guest user can create a new valid account


  Background: Shared Steps for sign up
    Given user go to Register Page
    When User Select Gender type
@smoke
  Scenario: Valid SignUp: Guest User can create valid account
    When  user enter first and last name and select date of birth
    And  user enter a valid email
    And  user enters company name
    And  newsLetter is unselected
    And  User enters passwords and confirms it
    And  user click the register button
    Then New account is created.


  #Negative Scenario
  Scenario: User Couldn't creat valid account
    When  user enter first and last name and select date of birth
    And  user enter a invalid email
    And  user enters company name
    And  newsLetter is unselected
    And  User enters passwords and confirms it
    And  user click the register button
    Then New account is not created.



