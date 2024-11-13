package kostiantyn;

public class FrequencyOfCharacters {
    public static String FreqOfChar(String str) {
        String uniqueSet = "";
        for (int i = 0; i < str.length(); i++) {

            if (!uniqueSet.contains("" + str.charAt(i))) {    // Use contains to check if the character is not already in uniqueSet
                uniqueSet += str.charAt(i);
            }
        }

        String result = "";
        for (int j = 0; j < uniqueSet.length(); j++) {
            char ch = uniqueSet.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            result += ch + "" + count;
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println(FreqOfChar(input)); // Output: A3B2C1D2
    }
}




/*
 /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/


