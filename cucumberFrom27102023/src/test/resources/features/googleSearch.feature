Feature: search in google

  @Riya
  Scenario: to search in google
    Given User fires up the laptop and opens the browser
    When user first search for google
    When user enters the data in form fields
      #| Fields    | Values         |
      | Name      | Tom            |
      | Last Name | Tom1           |
      | Email     | abcd@gmail.com |
      | Mobile    |        1234567 |
    And user in the search bar enters some value to search for
    Then user is able to see the results
