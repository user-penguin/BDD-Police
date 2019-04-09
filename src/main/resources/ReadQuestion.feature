Feature: Reading file
  Scenario:
    Given I have ReadFile object
    When I run reading "file.txt"
    Then The result should be equals "Привет"
  Scenario:
    Given I have ReadFile object
    When I run reading "file1.txt"
    Then The result should be equals "Привет\nПока"
