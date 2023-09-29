Feature: Checking Products Added Cart

  Background:
    Given Navigate to PrestaShop
    When Click on the element in MainMenu
      | login |
    Then Enter the input box
      | maillogin     | team14@cimail.com |
      | passwordlogin | Team14.tS        |
    And Click on the element in MainMenu
      | submitlogin |

  Scenario: Check the list
    When Click on the element in MainMenu
      | dresses |
    Then Add to cart few Dresses
      | dress1image |
      | dress2image |
      | dress3image |
    And Click on the element in MainMenu
      | cart |
    Then Check the quantity of products

