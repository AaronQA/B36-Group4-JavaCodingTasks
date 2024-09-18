package Stepan;

public class OddOrEven {

    public static void main(String[] args) {

        identify(5);
        identify(6);

    }

    public static void identify(int num){

        if(num%2==0){ // Check if the num is even
            System.out.println("Number: "+num+"\nType: Even");
        }else{  // Check if the num is odd
            System.out.println("Number: "+num+"\nType: Odd");
        }

    }


    /*Write  a method which can identify given int number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/

    /*
    We check if a number can be divided by 2 using remainder of division (%);
    If no remainder = even;
    Else = no.
     */

}