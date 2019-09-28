Feature: This feature includes scenarios to update personal information.

  Scenario Outline: Updating personal information

    Given I am on the AutomationPractice home page
    And I click sign in option
    And I enter email address <email>
    And I enter password <password>
    And I click Sign In button
    Then I see my-account page

    And I click my personal information button
    And I update my first name <updated name>
    And I enter my current password <password>
    And I click save button
    Then I see success message

    And I sign out from my account

    Examples:

      | email                     | password    | updated name |
      | sshinde@scottishpower.com | Password123 | sachintest   |
      | SeleniumTesting@gmail.com | Selenium123 | mytest       |