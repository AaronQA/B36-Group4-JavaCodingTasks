package Mahrukh;

public class OddOrEven {
    /*Write  a method which can identify given int number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/

    // Solution
    public static void main(String[] args) {
        identify(10);
        identify(3);
    }

    public static void identify(int num){

        boolean isEven = num % 2 == 0;                      // boolean condition to check if even
        String evenOrOdd = (isEven) ? "Even" : "Odd";       // ternary if else statement
        System.out.println(evenOrOdd);                      // return the result
    }
}
