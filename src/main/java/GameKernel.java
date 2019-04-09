import org.json.JSONArray;
import org.json.JSONObject;

public class GameKernel {
    private int nextQuestion;
    private int countOfQustions;
    private final static int oneCost = 200;
    private static int step = 0;

    public GameKernel() {
        nextQuestion = 0;
        countOfQustions = new JSONLib().getCountQuestions();
    }

    public String getNextQuestion() {
        JSONObject modules = new JSONObject(JSONLib.getText("/json/answers_and_questions.json"));
        JSONArray questions = modules.getJSONArray("modules");
        JSONArray concreteQuestion = questions.getJSONArray(nextQuestion);
        nextQuestion++;
        return concreteQuestion.getJSONObject(0).get("question").toString();
    }

    // @TODO реализовать получение правильного ответа
    public String getTrueAnswer(int numberOfQuestion) {
        return "Может договоримся, начальник";
    }
}
