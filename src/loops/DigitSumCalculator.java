package loops;
import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sum = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            sum += tempNumber % 10;
            tempNumber /= 10;
        }

        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }
}
