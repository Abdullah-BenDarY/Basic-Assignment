package functions_Arrays;

public class CountNum2 {


    public static void main(String[] args) {
        int arr [] = {2,4,5,8,2,4,5,7,9,2,1,8,2,24,9,5,12,2,1};

        int countNum = calculateCount(arr);

        System.out.println("Number 2 has repeated in "+ countNum + " times.");

    }
    public static int calculateCount(int arr[]){
        int count =0;
        for (int i=0 ; i < arr.length ; i++){
            if (arr[i] ==2){
                count++;
            }
        } return count;
    }
}
