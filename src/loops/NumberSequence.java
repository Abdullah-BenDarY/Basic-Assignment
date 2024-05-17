package loops;

public class NumberSequence {
    public static void main(String[] args) {
        int start = 7;
        int increment = 7;
        int count = 14;

        for (int i = 0; i < count; i++) {
            System.out.print(start + " ");
            start += increment;
        }
    }
}

    