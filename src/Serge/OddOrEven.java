package Serge;


import static Aaron.OddOrEven.oddOrEven;

public class OddOrEven {

    public static void oddOrEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
    public static void main(String[] args) {

        oddOrEven(10);
        oddOrEven(21);


    }

}



    /*Write  a method which can identify given int number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/
//Solution



