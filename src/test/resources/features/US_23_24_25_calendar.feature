Feature: Calender Functionality

  Background: Login with valid data
    When Navigate to the webpage.
    Then Enter username and password
    Then Click login button
    Then  Verify Home page opened

  @Us23-Us24-Us25
  Scenario: Calender page functionality
    When Click on the Calendar menu and verify that the page is displayed
    Then Review the courses listed on the calendar and check the course status icons
    Then On the Calendar page, you can see the weekly course plan and calendar page links, and click on these links
    Then Visibility and clickability of the Previous, Today, and Next icons
    Then The visibility and clickability of lessons on the weekly course schedule page


    Then Clickable access to a course on the Weekly Course Plan page and access to information about that course
    Then A course that has not yet been published is clicked, a pop-up window may appear containing information about the course
    Then Click on a published (P), started (S), or finished (E) course and check if the information screen can be opened


    Then A completed lesson (E) is clicked, a link to access the lesson video should open and be clickable
    Then Checking the clickability of the save button and access to the lesson video
    Then close page