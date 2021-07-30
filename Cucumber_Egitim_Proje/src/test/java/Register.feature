@SmokeTest
Feature: Register Test

  Scenario Outline: Create An Account

    Given Navigate to Website
    And click Sign in button
    And type email "<email>"
    And click on Create an Account button
    And choose title
    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"
    And type Company "<company>"
    And type address "<address>"

    Examples:
      | email                    | firstname      | lastname       | password  | company   | address     |
      | example_mail_1@gmail.com | FirstName1     | LastName1      | pA$$W0Rd1 | Company1  | Address1    |
      | example_mail_2@gmail.com | FirstName2     | LastName2      | pA$$W0Rd2 | Company2  | Address2    |

