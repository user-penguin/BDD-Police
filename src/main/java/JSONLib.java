import org.json.JSONArray;
import org.json.JSONObject;

public class JSONLib {
    public static String getText(String path) {
        return new JSONObject(new ReadFile().readFromFile(path)).toString();
    }

    public static String findQuestionById(int operand1) {
        JSONObject modules = new JSONObject(JSONLib.getText("/json/answers_and_questions.json"));
        JSONArray questions = modules.getJSONArray("modules");
        JSONArray concreteQuestion = questions.getJSONArray(operand1);
        String result = concreteQuestion.getJSONObject(0).get("question").toString();
        return result;
    }
}
