Feature: Логика игрового ядра
  Scenario: Получение следующего вопроса
    Given I have an object of GameKernel Class
    When I call the GetNextQuestion method
    Then I get the question "Сколько белых полосок на жезле инспектора ГИБДД?"
    When I call this method again
    Then I get the question "После какой фразы нужно вызывать сотрудников СОБР?"

  Scenario: Получение правильного ответа на конкретный вопрос
    Given I have an object of GameKernel Class
    When I have input number of question 1
    And I have call the method that should return true answer
    Then I get the answer "Может договоримся, начальник"
