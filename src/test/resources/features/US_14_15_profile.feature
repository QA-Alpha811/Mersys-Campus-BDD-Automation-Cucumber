Feature: Profile Settings Tests

  Background: Login with valid data
    When Navigate to the webpage.
    Then Enter username and password
    Then Click login button
    Then  Verify Home page opened

    Scenario: Profile settings check
      Then click the profile settings button
      Then click the settings button
      Then click avatar to upload profile picture
      Then click the box for upload profile picture
      Then select picture from local PC and click open button
      Then click the upload button
      Then click the save button
      Then verify that all changes with success message
      Then click the settings button again and change the theme for UI



