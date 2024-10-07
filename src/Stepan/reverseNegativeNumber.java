package Stepan;

import java.util.InputMismatchException;

public class reverseNegativeNumber {

    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static void main(String[] args){

        //reverseNegativeInt(123); // exception checked
        //reverseNegativeInt(0);   // exception checked
        System.out.println(reverseNegativeInt(-9));    // result: -9
        System.out.println(reverseNegativeInt(-10));   // result: -1
        System.out.println(reverseNegativeInt(-15));   // result: -51
        System.out.println(reverseNegativeInt(-100));  // result: -1
        System.out.println(reverseNegativeInt(-1599)); // result: -9951

    }

    public static int reverseNegativeInt(int number){

        if(number>=0){ // checks for a positive numbers.

            System.err.println("!!! invalid input : "+number+" !!!");
            throw new InputMismatchException("input should be a negative integer");

        }else if(number>-10){ // checks for a number that will remain the same, avoiding unnecessary calculations below.

            return number;

        }else{ // reverses a negative number which is greater or equal to 10.

            StringBuilder sb = new StringBuilder().append(number).deleteCharAt(0).reverse(); // 1) insert number;
                                                                                                   // 2) deletes the minus;
            while(sb.charAt(0)==0){                                                                // 3) reverses.

                sb.deleteCharAt(0);

            } // deletes any zeroes from the begging.

            return Integer.parseInt(sb.insert(0,"-").toString()); // adds new minus at the begging and returns int.

        }

    } // reverses negative integers, returning them afterwards

}

