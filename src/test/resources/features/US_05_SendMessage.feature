Feature: US_05 Send Message

  Background: Login with valid data
    When Navigate to the webpage.
    Then Enter username and password
    Then Click login button
    Then Verify Home page opened

  Scenario: US_05 HamburgerMenu_Messaging_SendMessage
    When Click Hamburger Menu icon
    And Hover over "Messaging" link
    And Click "Mesaj Gönder" link
    Then New Message page opens
    And Text editor is displayed
    When Click Receivers icon
    Then Recipient panel opens
    When Type "Hea" in recipient search
    Then Recipient list is filtered
    When Select "Head Teacher"
    And Close recipient panel
    Then "Head Teacher" appears in recipients field
    When Enter subject "Test Message"
    And Enter message body "This is a test message"
    And Select all text
    And Copy text
    And Paste text
    And Click Table icon
    And Create 2x2 table
    And Click Attach Files
    And Select file from my files
    And Select first file from list
    When Click Send button
    Then Success message appears
    When Navigate to Outbox
    Then Message "Test Message" appears in list