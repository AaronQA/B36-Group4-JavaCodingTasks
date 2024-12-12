package Mahrukh;


public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

public static void main(String[] args) {
    int[] positiveTest1 = {99, 12, 23, 32, 44, 57, 6};
    minNumberArrayForLoop(positiveTest1);

    int[] positiveTest2 = {0, -1, 2, 3, 4, 5, 6};
    minNumberArrayForLoop(positiveTest2);

    //Negative testing
    //minNumberArray(null);
    //minNumberArray(new int[0]);
    //minNumberArray(new int[]{});

    //------------------------ Min &  Max values using for each iteration -------------------------- for my review

    int[] positiveTest3 = {99, 12, 23, 32, 44, 57, 6};
    minMaxNumberArrayForEach( positiveTest3);

    //negative testing
    //minMaxNumberArrayForEach(null);
    //minMaxNumberArrayForEach(new int[0]);
    //minMaxNumberArrayForEach(new int[]{});


}

public static void minNumberArrayForLoop(int[] arr){
    if(arr == null || arr.length == 0){
        System.err.println("Array is empty. Please try again.");
        return;
    }

    int min = arr[0];

    for(int i = 1; i < arr.length; i++){
        if(arr[i] < min){
            min = arr[i];
        }
    }

    System.out.println("Minimum number in the array: " + min);
}

public static void minMaxNumberArrayForEach(int[] arr){
    if(arr == null || arr.length == 0){
        System.err.println("Array is empty. Please try again.");
        return;
    }

    int max = arr[0];
    int min = arr[0];

    for (int each : arr){
        if (each > max){
            max = each;
        }
        if (each < min){
            min = each;
        }
    }
    System.out.println("Maximum number is " + max);
    System.out.println("Minimum number is " + min);
}



}