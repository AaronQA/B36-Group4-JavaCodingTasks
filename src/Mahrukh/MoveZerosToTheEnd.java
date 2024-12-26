package Mahrukh;


import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 2, 0, 3, 0, 4, 0};
        System.out.println(Arrays.toString( moveZerosToEnd(arr1) ));
    }

    public static int[] moveZerosToEnd(int[] array) {
        int index = 0;

        // Place non-zero elements in the front
        for (int num : array) {
            if (num != 0) {
                array[index++] = num;
            }
        }

        // Fill the rest with zeros
        for (int i = index; i < array.length; i++) {
            array[i] = 0;
        }

        return array;
    }
}