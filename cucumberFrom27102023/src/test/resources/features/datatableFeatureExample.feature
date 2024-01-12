Feature: to check the jsExecuter working with datatableExample

  Scenario: to verify jsExecuter snippets and working with datasets example
    Given uers opens up the browser in chrome
    When user navigated to "google.com" and searches for "jsExecuter" site and
    And checks for jsExecuter code in same site for various values
      | values | something |
      | Name   | abc       |
      | age    |        12 |
      | place  | bangalore |
    Then user implements some methods related to jsExecuter in the chrome
