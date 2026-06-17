Feature: Attendance Functionality

  Background: Login with valid data
    When Navigate to the webpage.
    Then Enter username and password
    Then Click login button
    Then  Verify Home page opened

    Scenario:Attendance check excuses
      Then click the attendance button
      Then click the attendance excuses
      Then click the add excuse button
      Then select type of excuse
      Then select date range
      Then write massage to teacher
      Then upload file
      Then click the send button





