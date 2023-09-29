Feature: New Address Adding

  Background:
    Given Navigate to PrestaShop
    When Click on the element in MainMenu
      | login |
    Then Enter the input box
      | maillogin     | team14@cimail.com |
      | passwordlogin | Team14.tS           |
    And Click on the element in MainMenu
      | submitlogin |

  Scenario: New address adding
    When Click on the element in MainMenu
      | myaccount      |
      | myfirstaddress |
    Then Enter the input box
      | addressline | Ataturk Cad. Oran |
      | cityline    | Ankara            |
      | postcode    | 42050             |
      | homephone   | 03123123122       |
      | mobilephone | 05333123122       |
    And Select state
    Then Click on the element in MainMenu
      | submit |
