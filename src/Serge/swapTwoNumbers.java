package Serge;

public class swapTwoNumbers {
    public static void main(String[] args) {


        int num1 = 10;
        int num2 = 20;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);


        System.out.println("OR_______________________________");


        swapNumbers(10, 20);


    }

    public static void swapNumbers(int n1, int n2) {
        System.out.println("Initial n1: " + n1);
        System.out.println("Initial n2: " + n2);

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("Swapped n1: " + n1);
        System.out.println("Swapped n2: " + n2);

    }
}
