package loops;

import java.util.Scanner;


public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();


        if (number < 0) {
            number = -number;
        }

        if (number == 0) {
            System.out.println("The number of digits in 0 is: 1");
        } else {
            int count = 0;
            int tempNumber = number;

            while (tempNumber != 0) {
                tempNumber /= 10;
                count++;
            }

            System.out.println("The number of digits in " + number + " is: " + count);
        }
    }
}
