Feature: Reading JSON
  Scenario:
    Given I have JSONLib object
    When I have run reading "/json/test.json"
    And I have get result after parsing
    Then The result should be correct json