Feature: Finance Functionality

  Background: Login with valid data
    When Navigate to the webpage.
    Then Enter username and password
    Then Click login button
    Then  Verify Home page opened

  Scenario: US_12 HamburgerMenu_Finance
    When Click on the Hamburger Menu
    Then Click on the Finance button
    Then Click on the My Finance button
    Then Click on Three Dots on Finance Page
    Then Click on Excel Export
    Then Verify Excel Report was successful