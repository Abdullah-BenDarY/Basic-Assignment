package functions_Arrays;
import java.util.Scanner;

public class ArraySummation {
    public static void main(String[] args) {
        calculateArraySum();
    }

    public static void calculateArraySum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements of array: ");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = calculateSum(arr);
        System.out.printf("The summation of array is: " + sum);
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}