Feature: Reading JSON
  Scenario:
    Given I have JSONLib object
    When I have run reading "/json/test.json"
    And I have get result after parsing
    Then The result should be correct json
  Scenario:
    Given I have JSONLib object
    When I have run finding question by id 0 from file "/json/answers_and_questions.json"
    And I have get result in the form of String
    Then The result equals to "Сколько белых полосок на жезле инспектора ГИБДД?"