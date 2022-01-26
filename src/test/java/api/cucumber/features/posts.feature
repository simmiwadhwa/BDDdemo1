Feature: Post feature of Facebook

  @SmokeTest
  Scenario:Post a message on user wall
    Given user should be logged in and should be present on his wall
    When I type the message in the text box
    And click on Post button
    Then message should get posted