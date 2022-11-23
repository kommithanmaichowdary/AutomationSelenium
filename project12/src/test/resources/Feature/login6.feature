Feature: working on web application

  Scenario Outline: newtours.com
    Given user is in newtours page
    When user prints title & url
    Then user sendData
    And user closes window
