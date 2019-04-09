public class GameKernel {
    private int nextQuestion;
    private int countOfQustions;
    private final static int oneCost = 200;
    private static int step = 0;

    public GameKernel() {
        nextQuestion = 0;
        countOfQustions = new JSONLib().getCountQuestions();
        step = 0;
    }

    // @TODO реализовать метод получения следующего вопроса
    public String getNextQuestion() {
        if (step == 0) {
            step++;
            return "Сколько белых полосок на жезле инспектора ГИБДД?";
        } else if (step == 1) {
            return "После какой фразы нужно вызывать сотрудников СОБР?";
        } else {
            return "";
        }
    }
}
