package AndriiK;

public class swapTwoNumbers {
    //Swap two int variables' values without using a third variable
    public static void main(String[] args) {
swapNums(20,30);
    }

    public static void swapNums(int num1, int num2){
        System.out.println("Original number 1 = " + num1);
        System.out.println("Original number 2 = " + num2);


        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Swapped number 1 = " + num1);
        System.out.println("Swapped number 2 = " + num2);
    }



}
