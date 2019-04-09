Feature:
  Scenario:
    Given I have an object of GameKernel Class
    When I call the GetNextQuestion method
    Then I get the question "Сколько белых полосок на жезле инспектора ГИБДД?"
    When I call this method again
    Then I get the question "После какой фразы нужно вызывать сотрудников СОБР?"
