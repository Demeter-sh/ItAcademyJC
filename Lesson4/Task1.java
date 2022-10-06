public class Task1 {
    public static void main(String[] args) {
        int x = 0;
        int number = 0;
        String lineNumber = "";
        while (number < 10) {
            number++;
            lineNumber += number + " ";
            x++;
        }
        System.out.println(lineNumber);
    }
}