Feature: Reading JSON
  Scenario:
    Given I have JSONLib object
    When I have run reading "/json/test.json"
    And I have get result after parsing
    Then I The result should be equals "Привет"