
Feature: login :  user can log in  with his valid account
  Background: Shared Steps for log in
    Given user go to login Page
@smoke
Scenario: Valid login :user can log in with his valid account
  When  user enter his valid email
  And  user enter a valid password
  And user clicks on remember me option
  And user clicks on login button
  Then user successfully log in.