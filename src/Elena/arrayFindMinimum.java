package Elena;

public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

    public static void main(String[] args) {
        int[] arr1 = {99, 12, 23, 32, 44, 57, 6};
        int[] arr2 = {28, 15, -7, 99};
        int[] arr3 = null;

        System.out.println("Minimum number is: " + findMin(arr1));
        System.out.println("Minimum number is: " + findMin(arr2));
        System.out.println("Minimum number is: " + findMin(arr3));
    }

    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.err.println("Array must not be null or empty.");
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}


