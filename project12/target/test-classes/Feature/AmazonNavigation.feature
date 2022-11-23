Feature: working on web application

  Scenario: amazon.com
    Given user opens browser and navigate to amazon page
    When capture all the links and use navigate back method
    Then get title and url of the clicked links
    And store them in excel sheet
    And close the browser
