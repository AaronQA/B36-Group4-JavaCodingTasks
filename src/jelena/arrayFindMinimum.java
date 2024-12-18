package jelena;


public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6


    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int[] arr2 = {-12,-4,0,2,6,77};
        System.out.println(minNumber(arr));
        System.out.println(minNumber(arr2));

    }

    public static int minNumber(int[] arr) {

        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }


}