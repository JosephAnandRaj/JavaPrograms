Feature: This is the Login Feature for FMCG

  Scenario: Verify the Login with valid username and password
    Given user navigate to Login page "<url>"
    When user enters the valid username and Password "<Username>""<Password>"
    And Click on the Login button
    Then the user should get navigated to Home Page
    And User logout the Application    
    
  Examples:
| url                        | Username | Password |
| http://fmcg.sanfmcg.com/   | Admintest| Test     |

