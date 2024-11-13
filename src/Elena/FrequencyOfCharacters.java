package Elena;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println("Frequency of characters: " + getFrequency(input));
    }

    public static String getFrequency(String str) {
        String result = "";

        // Outer loop iterates through each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            // Check if character is already processed
            if (result.indexOf(currentChar) != -1) {
                continue; // Skip if character is already added to result
            }

            // Count occurrences of the current character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Append character and its count to result
            result += currentChar + "" + count;
        }

        return result;
    }
}