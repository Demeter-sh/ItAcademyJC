public class Task3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int z =0;
        for (int i = 0; i <= 10; i++){
            z = x + y;
            System.out.println(x);
            x = y;
            y = z;
        }
        }
    }
