Feature: working on login window

  Scenario Outline: new tours application
    Given user is in new tours application
    When user needs to enter uname and password
    Then user clicks on submit button
    And user navigated to homepage

    Examples: 
      | uname   | Password |
      | mercury | mercury  |
