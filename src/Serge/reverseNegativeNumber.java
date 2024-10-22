package Serge;

import java.util.InputMismatchException;

public class reverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println( reverse(-21));
        System.out.println(reverse(21));
        System.out.println(reverse(0));



        //Write a return method that can reverse digits of a negative number and return it as int
        //input: -35  output: -53
    }

    public static int reverse(int x) {

        String num;
        String reversed = "-";
        int reversedInteger;

        if (x >= 0) {
            throw new InputMismatchException("The number must be negative");
        } else {
            num = String.valueOf(x);
        }

        for (int i = num.length() - 1; i >= 1; i--) {
            reversed += num.charAt(i);
        }

        return reversedInteger = Integer.parseInt(reversed);

    }


}
