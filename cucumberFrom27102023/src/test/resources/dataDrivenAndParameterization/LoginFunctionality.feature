Feature: to verify loging functionality of facebook

  Scenario Outline: login feature of facebook
    Given user opens up the browser
    And navigates to facebook url
    When user enters <username> and <password> done
    And users click on login
    Then user should be logged in facebook

    Examples: 
      | username | password |
      | name1    | pass1    |
      | name2    | pass2    |
