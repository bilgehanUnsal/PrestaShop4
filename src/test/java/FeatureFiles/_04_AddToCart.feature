Feature: User Add to Cart something

  Background:
    Given Navigate to PrestaShop
    When Click on the element in MainMenu
      | login |
    Then Enter the input box
      | maillogin     | team14@cimail.com |
      | passwordlogin | Team14.tS          |
    And Click on the element in MainMenu
      | submitlogin |

  Scenario: Add to cart
    When Hover over and click summer dresses
    Then Hover over and click few summer dresses
    And Product should be successfully added to cart
