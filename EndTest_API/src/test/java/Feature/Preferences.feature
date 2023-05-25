Feature: I want to verify the Preferences Feature

  Background: App Launching before Scenarios
    Given API Demo app is Launched

  @Preferences_Page
  Scenario: to verify the Preferences page
    When user clicks on preferences
    When user clicks Fragments
    When user clicks on list prefernces
    Then user Verify Alpha Option

  @outline
  Scenario Outline: verify the text page for multiple message
    When user clicks on preferences
    When user clicks Fragments
    When user clicks edit text preferences
    When user provides name "<text>"
    Then user clicks on ok button and moves on
    Then user Verify Message Body

    Examples: 
      | text              |
      | API demo1 Testing |
      | API demo2 Testing |
