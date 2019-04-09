Feature: Reading file
  Scenario:
    Given I have ReadFile object
    When I run reading "/txt/file.txt"
    And I have get result after reading
    Then The result should be equals "Привет"
  Scenario:
    Given I have ReadFile object
    When I run reading "/txt/file1.txt"
    And I have get result after reading
    Then The result should be equals "Привет\nПока"
