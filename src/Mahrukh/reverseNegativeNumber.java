package Mahrukh;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static void main(String[] args) {
        reverseNegativeNumbers(-35);

        // Negative Testing
        //reverseNegativeNumbers(35);
        //reverseNegativeNumbers(0);
    }

    public static void reverseNegativeNumbers(int num){
        if (num >= 0){
            throw new IllegalArgumentException("Number must be less than 0");
        }else {
            String negativeInt = "" + num;      // convert int to String
            String reverseInt = "";             // create an empty string to for reversed version

            for (int i = negativeInt.length()-1; i >= 1 ; i--) {    // reversed for loop
                reverseInt += negativeInt.charAt(i);                // concatenate reversed chars into reversed string
            }

            reverseInt = "-" + reverseInt;                          // concatenate "-" into revered integer String
            System.out.println(Integer.parseInt(reverseInt));       // convert String back to integer and print the value
        }
    }


}

