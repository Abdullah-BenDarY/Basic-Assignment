package functions_Arrays;

public class CountNum2 {


    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 8, 2, 4, 5, 7, 9, 2, 1, 8, 2, 24, 9, 5, 12, 2, 1};
        calculateCount(arr);

    }

    private static void printCount(int count) {

        if (count > 0) {
            System.out.println("Number 2 has repeated in " + count + " times.");
        } else {
            System.out.println("Not found.");

        }
    }

    private static void calculateCount(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                count++;
            }
        }
        printCount(count);
    }
}
