Feature: US_06 Delete Message

  Background: Login with valid data
    When Navigate to the webpage.
    Then Enter username and password
    Then Click login button
    Then Verify Home page opened

  Scenario: US_06 HamburgerMenu_Messaging_DeleteMessage
    When Click Hamburger Menu icon
    And Hover over "Messaging" link
    And Click "Giden Kutusu" link
    Then Outbox page opens
    And Message list is displayed
    And Click trash icon for first message
    Then Delete confirmation appears
    When Click Yes button
    Then Success message appears
    When Refresh page