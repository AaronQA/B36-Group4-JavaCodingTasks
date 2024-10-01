package Kostiantyn;

public class swapTwoNumbers {

            public static void swap(int a, int b) {
                // Print original values
                System.out.println("Before Swap: a = " + a + ", b = " + b);

                // Swapping logic
                a = a + b; // Step 1: a becomes the sum of a and b
                b = a - b; // Step 2: b becomes the original value of a
                a = a - b; // Step 3: a becomes the original value of b

                // Print swapped values
                System.out.println("After Swap: a = " + a + ", b = " + b);
            }

            public static void main(String[] args) { swap (1,0) ;}   //// Call the method to swap the values

            }




// //Swap two int variables' values without using a third variable