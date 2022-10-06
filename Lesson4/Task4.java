public class Task4 {
    public static void main(String[] args) {
        int firstNum = 1;
        int secondNum = 1;
        int result = 0;
        while (firstNum <= 10) {
            while (secondNum <= 10) {
                result = secondNum * firstNum;
                System.out.printf("%4d",result);
                secondNum++;
            }
            System.out.println("");
            firstNum++;
            secondNum = 1;
        }
    }
}
