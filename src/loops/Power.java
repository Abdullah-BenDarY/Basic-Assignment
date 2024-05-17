package loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = scanner.nextInt();

        System.out.print("Enter power: ");
        int power = scanner.nextInt();

        long result = 1;

        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println("The result is: " + result);
    }
}
