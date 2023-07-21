Feature: this will check login function of simplilearn

  Background: 
    Given I have to launch the application
    And I have clicked on login link
@Regression @Sanity
  Scenario: this will positive test case validate login success (background is common steps to execute above)
    When I enter username
    And I enter password
    And I click on login button
    Then I should land on homepage
@Sanity
  Scenario: this will negative test case validate login failure
    When I enter username
    And I enter password
    And I click on login button
    Then I should get the error message
@Sanity
  Scenario: this will negative test case validate login failure (with parameters)
    When I enter username "XYS@gmail.com"
    And I enter password "XYS@gmail"
    And I click on login button
    Then I should get the error message "The email address or mobile number you entered isn't connected to an account."
@wip
  Scenario Outline: this will negative test case validate login failure (with parameters from above) using examples
    When I enter username "<username>"
    And I enter password "<password>"
    And I click on login button
    Then I should get the error message "<error>"

    Examples: 
      | username      |  | password   |  | error                                                                         |
      | BRS@gmail.com |  | XYS@gmailm |  | The email address or mobile number you entered isn't connected to an account. |
      | BJP@gmail.com |  | XYS@gmailm |  | The email address or mobile number you entered isn't connected to an account. |
