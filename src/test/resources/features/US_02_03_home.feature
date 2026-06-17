Feature: Home functionality

  Background: Login with valid data
    When Navigate to the webpage.
    Then Enter username and password
    Then Click login button
    Then  Verify Home page opened


  Scenario: Student should see and use the company logo after login
    Given The user should see the company logo on the top left
    When The user clicks on the company logo
    Then The user should be redirected to "https://techno.study"

  @Smoke
  Scenario: Verify all main menu items are clickable and perform correct actions
    When The user examines the main menu items one by one, clicks on each one, and confirms that they have been clicked.
      | Logo         |
      | Classes      |
      | Calendar     |
      | Attendance   |
      | Assignments  |
      | Grading      |
      | Notification |
      | Messages     |
      | Profile      |

