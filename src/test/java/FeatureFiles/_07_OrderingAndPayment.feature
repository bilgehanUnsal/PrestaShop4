Feature: Order and Payment

  Background:
    Given Navigate to PrestaShop
    When Click on the element in MainMenu
      | login |
    Then Enter the input box
      | maillogin     | team14@cimail.com |
      | passwordlogin | Team14.tS        |
    And Click on the element in MainMenu
      | submitlogin |

  Scenario: Order and Payment
    When Click on the element in MainMenu
      | dresses |
    Then User add to cart few Dresses
    And Click on the element in MainMenu
      | cart     |
      | checkout |
      | proceed  |
    And Checkbox button
    Then User select unsuccessfull payment method
      | paypal     |
      | creditcard |
    And User select successfull payment method
      | bankwire |
    Then User check the info
    Then Success message should be displayed
    And  Click on the element in MainMenu
      | orderhistory |



