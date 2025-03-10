Feature: Adding new address

  Scenario Outline: User can add new addresses
    Given I'm on adding address form
    When I enter "<alias>", "<address>", "<city>", "<zipcode>", "<phone>"
    And I enter country
    And I click save
    Then I can see success message "Address successfully added!"

    Examples:
    |alias  |address  |city |zipcode  |phone  |
    |dom1   |adres1   |miasto1|12-332 |12345  |
    |dom2   |adres2   |miasto2|13-457 |54321  |