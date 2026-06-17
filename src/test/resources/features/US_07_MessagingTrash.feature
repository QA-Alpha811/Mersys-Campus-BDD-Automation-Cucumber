Feature: US_07 Restore and Delete Messages in Trash

  Background: Login with valid data
    When Navigate to the webpage.
    Then Enter username and password
    Then Click login button
    Then Verify Home page opened

  Scenario: US_07 Deleted messages in Trash (Restore, Delete, Cancel)
    When Click Hamburger Menu icon
    And Hover over "Mesajlaşma" link
    And Click "Çöp" link
    Then Trash page opens
    And Deleted messages list is displayed
    And Restore and Delete icons should be visible and clickable
    When Click restore icon for first message
    Then Success message appears
    And Message should be restored successfully
    When Click trash icon for first message
    Then Delete confirmation appears
    When Click Yes button
    Then Success message appears
    And Message should be permanently deleted
    When Click trash icon for first message
    Then Delete confirmation appears
    When Click Cancel button
    Then Message should remain in Trash
    When Refresh page
    Then Trash page opens
    And Deleted messages list is displayed
