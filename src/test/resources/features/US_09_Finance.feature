Feature: Finance Functionality

  Background:Login with valid data
    When Navigate to the webpage.
    Then Enter username and password
    Then Click login button
    Then  Verify Home page opened

  Scenario: US_09 HamburgerMenu_Finance
    When Click on the Hamburger Menu
    Then Click on the Finance button
    Then Click on the My Finance button
    Then Verify Finance page opened
    Then Click on the Student's Name
    Then Click on the Fee_Balance Detail
    Then Verify Installment Table is visible