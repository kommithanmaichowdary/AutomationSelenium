Feature: web application

  Scenario: working on newtours page
    Given user opens new tour site
    When user clicks on register link
    Then user needs to get country names from drop down
    And user navigate back to home page
    And user closes the page
