package loops;


public class DivisibleByFive {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}