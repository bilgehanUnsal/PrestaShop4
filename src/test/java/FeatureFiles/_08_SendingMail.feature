Feature: Sending mail

  Background:
    Given Navigate to PrestaShop
    When Click on the element in MainMenu
      | login |
    Then Enter the input box
      | maillogin     | team14@cimail.com |
      | passwordlogin | Team14.tS           |
    And Click on the element in MainMenu
      | submitlogin |

  Scenario: Sending mail
    When Click on the element in MainMenu
      | contactus |
    Then Select class subject heading
    And Enter the input box
      | sendmessage | urun hatali cikti |
    And Click on the element in MainMenu
      | choosefile |
    Then Upload file robot class
    And Click on the element in MainMenu
      | sendbutton |

