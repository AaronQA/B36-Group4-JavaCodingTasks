package Serge;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/


    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("AAABBCDD")); // A3B2C1D2
    }

    public static String frequencyOfCharacters(String input) {
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i)) && !output.contains("" + input.charAt(i))) {
                output += input.charAt(i);
                int count = 0;
                for (int j = 0; j < input.length(); j++) {
                    if (input.charAt(j) == input.charAt(i)) {
                        count++;
                    }
                }
                output += count;
            }
        }
        return output;
    }

}

