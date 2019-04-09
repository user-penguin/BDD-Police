import org.json.JSONObject;

public class JSONLib {
    public static String getText(String path) {
        return new JSONObject(new ReadFile().readFromFile(path)).toString();
    }
}
