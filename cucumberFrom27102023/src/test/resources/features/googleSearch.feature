Feature: search in google

  Scenario: to search in google
    Given User fires up the laptop and opens the browser
    When user first search for google
    And user in the search bar enters some value to search for
    Then user is able to see the results
