package loops;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Enter positive numbers (enter a negative number to stop):");

        while (true) {
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            sum += number;
            count++;
        }

        double average = (double) sum / count;

        System.out.println("Average of the positive numbers entered: " + average);
    }
}
