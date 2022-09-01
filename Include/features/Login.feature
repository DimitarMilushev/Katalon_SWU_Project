@tag
Feature: Login feature

  @tag1
  Scenario Outline: Test login with valid credentials
    Given User navigates to login page
    When User enters <username> and <password>
    And User clicks on login button
    Then User is navigated to home  
    Examples: 
      | username | password | 
      | standard_user | qcu24s4901FyWDTwXGr6XA== | 