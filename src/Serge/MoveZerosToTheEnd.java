package Serge;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToTheEnd {

    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/

    public static void main(String[] args) {
        Integer[] array = {1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(moveZeroes(array)));
    }

    public static Integer[] moveZeroes(Integer[] a) {

        Integer[] res = new Integer[a.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] != 0) {
                res[index++] = a[i];
            }
        }

        while (index < a.length) {
            res[index++] = 0;
        }

        return res;
    }


}