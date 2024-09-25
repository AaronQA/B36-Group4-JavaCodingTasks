package Elena;
/*
   1. Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
   2. print "FIN" instead of the number and
   3. for numbers which are a multiple of 5, print "RA" instead of the number.
   4. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */

public class Finra {
    public static void main(String[] args) {
        finra(1, 30);
    }

    public static void finra(int startNum, int endNum) {
        for (int i = startNum; i <= endNum; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }

}
