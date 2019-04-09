public class GameKernel {
    private int nextQuestion;
    private int countOfQustions;
    private final static int oneCost = 200;

    public GameKernel() {
        nextQuestion = 0;
        countOfQustions = JSONLib.getCountQuestions();
    }
}
