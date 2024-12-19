package Stepan;

import java.util.Arrays;

public class MoveZerosToTheEnd {

    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/

    public static void main(String[] args) {

        int[] array = {1, 0, 2, 0, 3, 0, 4, 0};
        int[] arrayDefault = new int[1];
        int[] arrayEmpty = new int[0];

        System.out.println(Arrays.toString(arraySort(array)));          //output: [1, 2, 3, 4, 0, 0, 0, 0]
        System.out.println(Arrays.toString(arraySort(arrayDefault)));   //output: [0]
        System.out.println(Arrays.toString(arraySort(arrayEmpty)));     //output: []

    }

    public static int[] arraySort(int[] input) {    // bubble sorting, but with zeros only

        for (int i = 0; i < input.length - 1; i++) {

            for (int j = 0; j < input.length - 1 - i; j++) {

                if (input[j] == 0) {

                    input[j]     = input[j] ^ input[j + 1];
                    input[j + 1] = input[j] ^ input[j + 1];
                    input[j]     = input[j] ^ input[j + 1];

                }

            }

        }

        return input;

    }

}
