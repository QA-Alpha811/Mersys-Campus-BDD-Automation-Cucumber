Feature: Login functionality


  @Smoke
  Scenario: Login with valid data
    When Navigate to the webpage.
    Then Enter username and password
    Then Click login button
    Then  Verify Home page opened

  @Smoke
  Scenario Outline: Login with invalid username
    When Navigate to the webpage.
    Then Enter invalid username  and valid password "<invalidUsername>"
    Then Click login button
    Then Verify error message is displayed
    And Verify Home page is not opened
    Examples:
      | invalidUsername |
      | bariscansiz     |
