package Stepan;

public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

    public static void main(String[] args) {

        int[] test1 = null;
        int[] test2 = new int[0];
        int[] test3 = {99, 12, 23, 32, 44, 57, 6};

        minNumArray(test1);
        minNumArray(test2);
        minNumArray(test3);

    }

    public static void minNumArray(int[] input) {

        if (input == null) {

            System.out.println("Array is null");

        } else if (input.length == 0) {

            System.out.println("Array is empty");

        } else {

            int min = Integer.MAX_VALUE;

            for (int each : input) {

                if (each < min) {

                    min = each;

                }

            }

            System.out.println(min);

        }

    }

}