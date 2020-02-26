@Automation

Feature: Login Feature

  Some Description

  @FacebookLogin
  Scenario Outline: Verify Invalid Accounts
    Given The Facebook Page Is Active
    When A "<username>" and "<password>" is entered
    And The user clicks on the Log In button
    Then The credentials are "<status>"

    Examples:
      | username           | password        | status   |
      | user               | User123!        | invalid  |
      | tca3276@gmail.com  | User123!        | valid    |

  @CustomTest
  Scenario: Verify Invalid Accounts
    Given The Custom Page Is Active
    When The user clicks on the M size
    And The user clicks on the buy now button
    And The user hides the modal page
    And The user fill out the form
    Then An alert appears

  @CustomTest2
  Scenario: Test Scenario
    Given The Custom Page Is Active
    And The user fill the credentials
    When The user clicks on the create campaign button
    And The campaign modal is shown
    And The user select the first product
    And The user clicks on the Modal continue button
