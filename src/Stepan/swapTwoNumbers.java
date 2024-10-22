package Stepan;

public class swapTwoNumbers {

    public static void main(String[] args) {

        //Swap two int variables' values without using a third variable

        int int1 = 5;
        int int2 = 7;

        //Swapping using bitwise operation (or XOR):

        int1 = int1 ^ int2; // 0101 ^ 0111 = 0010
        int2 = int1 ^ int2; // 0010 ^ 0111 = 0101
        int1 = int1 ^ int2; // 0010 ^ 0101 = 0111

        System.out.println("Value of int1 = "+int1+"\nValue of int2 = "+int2);

        //output:
        //    Value of int1 = 7
        //    Value of int2 = 5

    }

    /*

    How it works:

    1) All values end up being converted into binary language, where we deal with bits ( 1 equals 1 bit, 0 equals no bit) ;
    2) We compare two values using XOR (represents as ^ sign);
    3) Number 5 and 7 in binary represent as:

        0000 0101 - it is numeral 5;
        0000 0111 - it is numeral 7;
        7654 3210 - it is index number of positions that goes from right to left;

    4) Now we compare each numbers with each other on their positions (eg. position 1 for num 5 = 0, for num 7 = 1);
    5) If on the position we have equal bit values (eg. 1 and 1 ; or 0 and 0) then in result we always have 0 (zero) !!;
    but if they differ (eg 0 and 1 ; or 1 and 0) then in result we always have 1 (one) !!;

        eg: 0000 0101 ^ 0000 0111 = 0000 0010

                        or

            0000 0101 - num 5
            0000 0111 - num 7
            0000 0010 - result (0010 = num 2)

                        or

            0101 ^ 0111 = 0010 - shorter version without zeros at the begging


    How to know binary representation of integer number:

        - start processing debugging, creating a break point somewhere (because Evaluate menu only works during debugging);
        - alt + F8 (to open Evaluate menu);
        - insert: Integer.toBinaryString(here must be provided your integer number)

        * as a parameter inside provide needed number (eg. Integer.toBinaryString(5) );

    How to know numeral representation of binary number:

        - start processing debugging, creating a break point somewhere (because Evaluate menu only works during debugging);
        - alt + F8 (to open Evaluate menu);
        - insert: Integer.parseInt("0111", 2)

        * the numeral 2 in the parentheses declares that you want to convert from binary system;

     */

}
