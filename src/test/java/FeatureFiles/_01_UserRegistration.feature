Feature: User Registration

  Scenario: Registration

    Given Navigate to PrestaShop
    When Click on the element in MainMenu
      | login |
    And Enter the input box
      | inputmail | team14@cimail.com |
    Then Click on the element in MainMenu
      | createanaccount |
    And Click on the element in MainMenu
      | gender |
    And Enter the input box
      | inputfirstname | TeamOnDort     |
      | inputlastname  | TechnoStudy |
      | inputpassword  | Team14.tS   |
    And Select birthday
    And Click on the element in MainMenu
      | register |
    Then Check the logIn
