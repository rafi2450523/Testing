Feature: To verify the login page

  Background: user is logged In
    Given user is on login page
    When user enter username and password
    And clicks on login button
    Then user is navigated to the home page

  Scenario: Check admin module
    When user clicks on admin module
    And user enters username field value
    Then user clicks on search button
