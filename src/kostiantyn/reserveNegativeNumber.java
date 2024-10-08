package kostiantyn;

public class reserveNegativeNumber {




        public static void main(String[] args) {

            int inputNumber = -35;


            int reversedNumber = reverseNegativeNumber(inputNumber);   // Call the reverseNegativeNumber method and store the result in reversedNumber


            System.out.println("Reversed number: " + reversedNumber);
        }


        public static int reverseNegativeNumber(int number) {

            int reversed = 0;


            while (number != 0) { // Loop until the number becomes 0

                int lastDigit = number % 10; // Get the last digit of the number using the modulus operator


                reversed = reversed * 10 + lastDigit; // Add the last digit to the reversed number after shifting existing digits to the left


                number /= 10;     // Remove the last digit from the original number by dividing it by 10
            }


            return reversed;
        }
    }



/*'
//Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53
 */