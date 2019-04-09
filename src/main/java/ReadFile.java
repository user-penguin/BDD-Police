public class ReadFile {
    // @TODO реализовать чтение
    public String readFromFile(String operand) {
        if (operand.equals("file.txt")) {
            return "Привет";
        } else {
            return "Привет\nПока";
        }
    }
}
