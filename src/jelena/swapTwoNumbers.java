package jelena;
public class swapTwoNumbers {
    //Swap two int variables' values without using a third variable

    public static void main(String[] args) {
        
        
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;  //a=30
        b = a - b;  //b--> 30-20 = 10
        a = a - b;  //a--> 30-10 = 20

        System.out.println("After swapping: a = " + a + ", b = " + b);
        
    
        
        }

}
