public class Task2 {
    public static void main(String[] args) {
        int x = 0;
        int number = 10;
        String lineNumber = "";
        while(x <= 10) {
            lineNumber += number + " ";
            number--;
            x++;
        }
        System.out.println(lineNumber);
    }
}
