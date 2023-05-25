Feature: I want to verify the Animation Feature

  Background: App Launching before Scenarios
    Given API Demo app is Launched

  @Animation_Page
  Scenario: Verify the Animation page
    When user clicks on animation
    When user clicks on Layout animation
    Then user verify on Add button
    Then user verify on Custom Animation
