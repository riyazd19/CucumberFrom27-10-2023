Feature: To verify the login feature of facebook with datatable implementention

  Scenario: 
    Given user is in browser and searches for facebook
    When login page is displayed and user enters login data
      | Username | Password |
      | User1    | Pswd1    |
      | User2    | Pswd2    |
      | User3    | Pswd3    |
    And user clicks on login
