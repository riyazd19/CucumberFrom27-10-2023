Feature: To get the various values for the site and store or display in consol

  Scenario: get the various values of prises from the site
    Given User launches the browser
    And enter the site name
    When when site is displayed get the title
    And get the list of various objects form the site and store them
    Then validate those values againest user provided values
