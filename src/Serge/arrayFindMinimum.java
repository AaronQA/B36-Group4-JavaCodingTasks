package Serge;


public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6


    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        System.out.println(findMinimum( arr));

    }



    public static int findMinimum(int[] array){

        int min = array[0];

        for (int j : array) {

            if (j < min) {
                min = j;
            }
        }
        return min;
    }



}