package Mahrukh;

public class Finra {
    //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    //print "FIN" instead of the number and
    //for numbers which are a multiple of 5, print "RA" instead of the number.
    //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

    public static void main(String[] args) {
        finra(1, 30);
    }

    public static void finra(int startingNum, int endingNum){

        for (int i = startingNum; i <= endingNum ; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("RA");
            } else if (i % 5 == 0){
                System.out.println("FIN");
            } else {
                System.out.println(i);
            }

        }

    }
}
