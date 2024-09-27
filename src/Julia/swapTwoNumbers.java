package Julia;

import java.sql.SQLOutput;

public class swapTwoNumbers {
    //Swap two int variables' values without using a third variable

    public static void main(String[] args) {

        int num1 = 50;
        int num2 = 100;

        System.out.println("Num1 Value before swapping: " + num1);
        System.out.println("Num2 Value before swapping: " + num2);

        num1 = num2 + num1; // 50 + 100 = 150
        num2 = num1 - num2; //
        num1 = num1 - num2;

        System.out.println("-----------------------------------");
        System.out.println("Num1 Value after swapping: " + num1);
        System.out.println("Num2 Value after swapping: " + num2);

    }

}
