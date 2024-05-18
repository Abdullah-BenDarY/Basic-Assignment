package functions_Arrays;

public class EvenNumberCalculator {
    public static void main(String[] args) {
        int[] numbers = {1, 2 ,9,11,18,20,24,25};
        int[] result = CalculateEven(numbers);

        System.out.println("Sum of even numbers: " + result[0]);
        System.out.println("Count of even numbers: " + result[1]);
    }
    public static int[] CalculateEven(int[] array) {
        int sum = 0;
        int count = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
                count++;
            }
        }
        return new int[]{sum, count};
    }
}
