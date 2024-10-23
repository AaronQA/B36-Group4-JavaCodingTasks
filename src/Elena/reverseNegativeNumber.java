package Elena;

public class reverseNegativeNumber {
    public static void main(String[] args) {
        int input = -35;
        int reversed = reverseNegativeDigits(input);
        System.out.println(reversed); // Output: -53
    }

    public static int reverseNegativeDigits(int num) {
        // Check if the number is negative
        if (num >= 0) {
            throw new IllegalArgumentException("Input must be a negative number.");
        }

        // Initialize variables
        int reversed = 0;
        int temp = -num; //Make the number positive for processing

        // Reverse the digits
        while (temp != 0) {
            int digit = temp % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append digit to reversed
            temp /= 10; // Remove the last digit
        }

        return -reversed; // Return the reversed number as negative

    }


}
