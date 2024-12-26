package kostiantyn;

public class moveZerosToTheEnd {


        public static void main(String[] args) {
            int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
            System.out.println("Original array: " + java.util.Arrays.toString(arr));
            moveZerosToTheEnd(arr);
            System.out.println("Array after moving zeros to the end: " + java.util.Arrays.toString(arr));
        }

        public static void moveZerosToTheEnd(int[] arr) {
            int index = 0;

            // Move non-zero elements to the front
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[index++] = arr[i];
                }
            }

            // Fill the remaining positions with zeros
            while (index < arr.length) {
                arr[index++] = 0;
            }
        }
    }









    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/