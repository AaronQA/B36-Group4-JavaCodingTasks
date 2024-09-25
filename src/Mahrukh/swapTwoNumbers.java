package Mahrukh;
public class swapTwoNumbers {
    //Swap two int variables' values without using a third variable

    public static void main(String[] args) {

        swapIntegers(100,2);

    }

    public static void swapIntegers(int num1, int num2){

        System.out.println("Before the Swap: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 = num1 + num2;     // 10 =  10  +  1 =  11
        num2 = num1 - num2;     //  1 =  11  -  1 =  10  --> swapped
        num1 = num1 - num2;     // 11 =  10  -  11 =  1  --> swapped

        System.out.println("After the Swap: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }
}
