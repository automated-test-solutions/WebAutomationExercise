Feature: This feature includes scenarios to test T-shirt ordering and order verification functionality.

  Scenario Outline: Ordering T-Shirt and verifying history when I am initially logged out

    Given I am on the AutomationPractice home page
    When I clicks the T-Shirt tab
    Then I see available T-Shirts
    When I add a Tshirt to card
    And I proceed to checkout

    Then I see shopping-cart summary
    When I proceed to summary-checkout

    Then I see sign in page
    And I enter email address <email>
    And I enter password <password>
    And I click Sign In button

    Then I see Address details
    When I proceed to address-checkout
    Then I see shipping details
    And  I accept terms and conditions
    When I proceed to shipping-checkout

    Then I see Payments page
    And I select to pay by bank wire
    And I confirm my order
    Then I see order confirmation page
    And I capture order reference number

    When I navigate to my account
    And I click order history and details
    Then I see my recently purchased order
    And I sign out from my account

    Examples:

      | email                     | password    |
      | sshinde@scottishpower.com | Password123 |
      | SeleniumTesting@gmail.com | Selenium123 |







 # Scenario: Ordering T-Shirt and Verifying History when I am logged in



