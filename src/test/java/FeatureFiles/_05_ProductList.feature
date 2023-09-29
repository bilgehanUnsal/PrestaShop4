Feature: Checking Product List

  Background:
    Given Navigate to PrestaShop
    When Click on the element in MainMenu
      | login |
    Then Enter the input box
      | maillogin     | team14@cimail.com |
      | passwordlogin | Team14.tS        |
    And Click on the element in MainMenu
      | submitlogin |

  Scenario: Checking product list
    When Click on the element in MainMenu
      | dresses |
    Then Check the how many products this side
    And Check the how many products this product count
    Then Verify that the count matches the numbers in step two and step three
