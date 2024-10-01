package Stepan;

import java.util.InputMismatchException;

public class Finra {

    public static void main(String[] args) {

        //FINRA(-15, 0); // starting with negative - passed

        //FINRA(1, 0); // end > start = exception - passed

        FINRA(0, 5); // output: 0 1 2 FIN 4 RA

    }

    /*
    Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    print "FIN" instead of the number and
    for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

        FINRA();
     */

    public static void FINRA(int start, int end){

        if(start>end){
            System.err.println("!!! Invalid input : the end point is less than the start point !!!");
            throw new InputMismatchException("starting number must be less than or equal to end point");
        } //checks if end < start to throw the exception

        for (int i = start; i <= end; i++) {

            if(i==0){
                System.out.print(i+" ");
                continue;
            } // if i = 0 then print out the zero and skip (to avoid printing FINRA during 0 value);

            if(i%3 == 0 && i%5 == 0){
                System.out.print("FINRA ");
            }else if(i%3 == 0){
                System.out.print("FIN ");
            }else if(i%5 == 0){
                System.out.print("RA ");
            }else{
                System.out.print(i+" ");
            } // checks the conditions for i variable

        }

        System.out.println(""); // exits from current line

    }

}
