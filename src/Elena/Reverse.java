package Elena;

public class Reverse {

    public static void main(String[] args) {
        // Test cases
        System.out.println(reverseString("ABCD"));      // Output: DCBA
        System.out.println(reverseString("Ooops"));     // Output: spooO
        System.out.println(reverseString("hell0"));     // Output: 0ll3h
        System.out.println(reverseString(""));          // Output: (empty string)
        System.out.println(reverseString(null));        // Output: null
    }

    public static String reverseString(String input) {
        // Handle edge cases
        if (input == null) return null; // Null input
        if (input.isEmpty()) return ""; // Empty input

        char[] reversed = new char[input.length()];

        // Loop to reverse the string
        for (int i = input.length() - 1, j = 0; i >= 0; i--, j++) {
            char currentChar = input.charAt(i);

            // Explicitly check if the character is 'o' or '0' (but take no action)
            if (currentChar == 'o' || currentChar == 'O') {
                // Letter 'o' found; consider it could look like a zero in certain fonts or cases
            } else if (currentChar == '0') {
                // Digit '0' found; consider it could be misinterpreted as the letter 'o'
            }

            // Add the character to the reversed array
            reversed[j] = currentChar;
        }

        return new String(reversed);
    }
}