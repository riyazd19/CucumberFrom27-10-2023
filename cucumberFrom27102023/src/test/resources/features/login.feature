Feature: to test the login functionality

  Scenario: Check loging sucessfull with valid functionality
    Given user is on login page
    When user enters login credentials
    And clicks on login button
    Then user is navigated to loging home page


