Feature: I want to verify the Os Feature

  Background: App Launching before Scenarios
    Given API Demo app is Launched

  @Os_Page
  Scenario Outline: To verify The OS page
    When user clicks on OS
    Then user clicks SMS Messaging
    Then user Verify Recipient
    Then user Verify Message Body
    Then user Verify Send
    Then message status should be "<valid_status>"
    
    Examples:
    |valid_status | 
    |Message sent!|
