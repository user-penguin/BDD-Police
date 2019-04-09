import java.io.*;

public class ReadFile {
    public String readFromFile(String operand) {
        String pathToFile = ReadFile.class.getResource(operand).getPath();
        try {
            FileInputStream fileInputStream = new FileInputStream(pathToFile);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String result = bufferedReader.readLine();
            String unit = "";
            while((unit = bufferedReader.readLine()) != null) {
                result += "\n" + unit;
            }
            return result;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
