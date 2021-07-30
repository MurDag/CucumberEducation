@RegressionTest
Feature: Register Test

  Background:
    Given Navigate to Website
    And click Sign in button
    And type email "muraad.dag@gmail.com"
    And click on Create an Account button

  Scenario: Kişi 1

    And type firstname "Murat" and lastname "DAĞ"

  Scenario: Kişi 2
    And type Company "Testinium"
    And type address "İstanbul"

  Scenario Outline: Kişi 3

    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"
    And type Company "<company>"
    And type address "<address>"

    Examples:
      | email                    | firstname      | lastname       | password  | company   | address     |
      | example_mail_1@gmail.com | FirstName1     | LastName1      | pA$$W0Rd1 | Company1  | Address1    |
      | example_mail_2@gmail.com | FirstName2     | LastName2      | pA$$W0Rd2 | Company2  | Address2    |
