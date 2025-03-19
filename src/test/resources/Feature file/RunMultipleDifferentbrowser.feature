@TAG
Feature: Login functionality
Scenario Outline: Verify the Login with valid Credentials as MGR and Admin
  Given Login the Page "<username>" and "<password>"
  #
#Scenario Outline: User login with valid credentials
  #Given Login with valid URL "<url>"
  #And Login the Page with valid credentials "<username>" and "<password>"
  #
   #Examples:
#| url                        | username | password |
#| http://fmcg.sanfmcg.com/   | Admintest| Test    |