Feature: I want to verify the App Feature

  Background: App Launching before Scenarios
    Given API Demo app is Launched

  @App_Page
  Scenario: To verify The App page
    When user clicks on App
    When user clicks Action Bar
    When user clicks Display option
    Then user Verify Display_show_title
