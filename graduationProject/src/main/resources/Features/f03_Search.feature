@smoke
Feature: The user can use the search function in the website
  Background: shared steps for search
    Scenario: User search for a product
    Given user clicks on search box
    When user enter valid product name
    And clicks on search button
    And user uses advanced search to filter the products appear.
    Then the searched product appear
