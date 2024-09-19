package Mahrukh;

public class Finra {
    //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    //print "FIN" instead of the number and
    //for numbers which are a multiple of 5, print "RA" instead of the number.
    //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

    public static void main(String[] args) {
        finra(1, 30);
    }

    public static void finra(int startingNum, int endingNum){   // custom method with beginning & ending numbers as arguments

        for (int i = startingNum; i <= endingNum ; i++) {       // create for loop with mentioned arguments

            if (i % 3 == 0 && i % 5 == 0) {                     // multiple of 3 && 5 -> prints "FINRA"
                System.out.println("FINRA");
            } else if (i % 3 == 0) {                            // multiple of 3 -> prints "FIN"
                System.out.println("FIN");
            } else if (i % 5 == 0){                             // multiple of 5 -> prints "RA"
                System.out.println("RA");
            } else {                                            // every other numbers -> print the number
                System.out.println(i);
            }

        }

    }
}
