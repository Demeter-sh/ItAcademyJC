public class Task3 {
    public static void main(String[] args) {
        int x = 1;
        int num1 = 0;
        int num2 = 1;
        String numbersOfFibonacci = num1 + num2 + " ";
        while (x < 10) {
            int previousNum = num2;
            numbersOfFibonacci += num1 + num2 + " ";
            num2 = num1 + num2;
            num1 = previousNum;
            x++;
        }
        System.out.println(numbersOfFibonacci);
    }
}
