Feature: working on web application

  Scenario: Newtours.com
    Given user opens and navigate to new tours site
    When user gets the username and password from property list and clicks on link register
    Then get the screenshot
    And get the country names from dropdown and add to excel sheet
