public class Task4 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int z = 0;
        while (x <= 10){
            while (y <= 10){
            z = y * x;
                System.out.print(z + " ");
                y++;
            }
            x++;
            System.out.println();
            y=1;
        }
    }
}
