package loops;

public class NumberSequence2 {
    public static void main(String[] args) {
        int number = 1;
        int count = 9;

        for (int i = 0; i < count; i++) {
            System.out.print(number + " ");
            number *= 2;
        }
    }
}
