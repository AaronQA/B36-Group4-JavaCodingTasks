package Stepan;

import java.util.InputMismatchException;

public class Finra {

    public static void main(String[] args) {

        // FINRA(0); test with zero - passed
        // FINRA(-1); test with negative number - passed
        FINRA(30);

    }

    /*
    Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    print "FIN" instead of the number and
    for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

        FINRA();
     */

    public static void FINRA(int count){

        if(count<=0){
            System.err.println("!!! Invalid input : "+count+" !!!");
            throw new InputMismatchException("number must be greater than zero");
        }

        for (int i = 1; i < count; i++) {

            if(i%3 == 0 && i%5 == 0){
                System.out.print("FINRA ");
            }else if(i%3 == 0){
                System.out.print("FIN ");
            }else if(i%5 == 0){
                System.out.print("RA ");
            }else{
                System.out.print(i+" ");
            }

        }

    }

}
