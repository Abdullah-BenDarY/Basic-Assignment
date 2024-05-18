package functions_Arrays;


public class NumberOfArrayElements {
    public static void main(String[] args) {
        //int arr[] = {1, 2, 3, 4, 5, 6, 7, 87, 8};
        // System.out.println("Number of elements is: " + arr.lenth);

        int numOfElements = calculateNumOfElement();
        System.out.println("Number of elements is: " + numOfElements);
    }


    static int calculateNumOfElement() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 87, 8};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
    return count;
    }
}
