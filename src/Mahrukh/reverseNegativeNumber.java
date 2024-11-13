package Mahrukh;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static void main(String[] args) {
        System.out.println("reverseNegativeInteger(-30) = " + reverseNegativeInteger(-30));

        // Negative Testing
        //System.out.println("reverseNegativeInteger(35) = " + reverseNegativeInteger(35));
        //System.out.println("reverseNegativeInteger(0) = " + reverseNegativeInteger(0));
    }

    public static String reverseNegativeInteger(int num){
        if (num >= 0){
            throw new IllegalArgumentException("Number must be less than 0");
        }else {
            String negativeInt = String.valueOf(num);               // convert int to String
            String reverseInt = "";                                 // create an empty string for reversed version

            for (int i = negativeInt.length()-1; i >= 1 ; i--) {    // reverse for-loop excluding index 0 because index 0 is a "-" sign
                reverseInt += negativeInt.charAt(i);                // concatenate reversed chars into an empty reversed string
            }
//
            reverseInt = "-" + reverseInt;                          // concatenate "-" into revered integer String
            return reverseInt;                    // covert String back to integer and return the value
        }
    }


}

