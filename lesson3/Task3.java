public class Task3 {
    public static void main(String[] args) {
        int t=0;
        if (t >= 6 && t <= 12) {
            System.out.println("Доброе утро");
        }
        else if (t >= 12 && t <= 18) {
            System.out.println("Добрый день");
        }
        else if (t >= 19 && t<= 23) {
            System.out.println("Добрый вечер");
        }
        else if (t >=0 && t <= 6) {
            System.out.println("Доброй ночи");
        }
        else {
            System.out.println("Неправильное время");
        }
    }
}
