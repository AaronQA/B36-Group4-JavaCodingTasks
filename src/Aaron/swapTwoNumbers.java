package Aaron;
public class swapTwoNumbers {
    //Swap two int variables' values without using a third variable
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("first a: " + a);
        System.out.println("first b: " + b);

        a = a + b; //a is 30 now
        b = a - b; //b is 10 now
        a = a - b; //a is 20 now

        System.out.println("new a: " + a);//new a: 20
        System.out.println("new b: " + b);//new b: 10


        swap2numbers(5,10);
    }
    public static void swap2numbers(int num1, int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
