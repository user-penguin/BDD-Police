Feature: Reading file
  Scenario:
    When I run reading "file.txt"
    Then The result should be equals "Привет"
  Scenario:
    When I run reading "file1.txt"
    Then The result should be equals "Привет"
