package ifCondetion;

import java.util.Scanner;

public class PositiveNegativeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumPositive = 0;
        int sumNegative = 0;

        System.out.println("Enter six integers:");
        for (int i = 0; i < 6; i++) {
            int num = scanner.nextInt();
            if (num > 0) {
                sumPositive += num;
            } else if (num < 0) {
                sumNegative += num;
            }
        }
        System.out.println("Sum of positive integers: " + sumPositive);
        System.out.println("Sum of negative integers: " + sumNegative);

    }
}