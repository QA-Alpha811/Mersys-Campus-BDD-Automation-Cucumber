Feature: US_04 Messaging Navigation

  Background: Login with valid data
    When Navigate to the webpage.
    Then Enter username and password
    Then Click login button
    Then Verify Home page opened

  Scenario: US_04 HamburgerMenu_Messaging_Navigation
    When Click Hamburger Menu icon
    And Hover over "Messaging" link
    Then See all 4 submenu links
      | Mesaj Gönder  |
      | Gelen Kutusu  |
      | Giden Kutusu  |
      | Çöp           |

    When Click "Mesaj Gönder" link
    Then New Message page opens
    And Text editor is displayed
    When Click Hamburger Menu icon
    And Hover over "Messaging" link
    And Click "Gelen Kutusu" link
    Then Inbox page opens
    When Click Hamburger Menu icon
    And Hover over "Messaging" link
    And Click "Giden Kutusu" link
    Then Outbox page opens
    When Click Hamburger Menu icon
    And Hover over "Messaging" link
    And Click "Çöp" link
    Then Trash page opens