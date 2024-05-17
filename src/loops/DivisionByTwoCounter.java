package loops;
import java.util.Scanner;

public class DivisionByTwoCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0;

        while (number >= 2) {
            number /= 2;
            count++;
        }

        System.out.println("The number can be divided by 2 " + count + " times before it becomes less than 2.");
    }
}






