Feature: To verify the login page

  Scenario: To validate the login page
    Given user navigated to loginpage "url"
    When provided "username" and "password"
    And submit the login
    Then navigates to home page
