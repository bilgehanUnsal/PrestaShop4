Feature: LogIn User

  Background:
    Given Navigate to PrestaShop
    When Click on the element in MainMenu
      | login |

  Scenario: Login Functionality
    Then Enter the input box
      | maillogin     | team14@cimail.com |
      | passwordlogin | Team14.tS        |
    And Click on the element in MainMenu
      | submitlogin |
