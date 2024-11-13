package Mahrukh;

public class FrequencyOfCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
    }

    public static String frequencyOfChars(String str) {
        String nonDup = "";

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (eachChar == str.charAt(j)){
                    count++;
                }
            }

            if (nonDup.contains(eachChar+"")){
                continue;
            }
            nonDup += eachChar + "" + count + "";
        }
        return nonDup;
    }
}
