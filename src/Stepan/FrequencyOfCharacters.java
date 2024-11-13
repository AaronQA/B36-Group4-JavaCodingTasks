package Stepan;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfCharacters {

    /*
    Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    */ // the task explained

    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("AAABBCDD"));              // output: A-3 B-2 C-1 D-2
        System.out.println(frequencyOfCharacters(""));                      // output: ""
        System.out.println(frequencyOfCharacters("Hello! How do you do?"));
        // output: H-2 e-1 l-2 o-5 !-1 space-4 w-1 d-2 y-1 u-1 ?-1

        System.out.println("""
                
                - - - - - - - - - - - - - - - - - - - - - - - - - - -
                Enter your sentence below:""");
        System.out.println(frequencyOfCharacters(new Scanner(System.in).nextLine()));// for your input test!

    }

    public static String frequencyOfCharacters(String sentence) {

        if(sentence == null || sentence.isEmpty()){ // checks whether "sentence" is empty

            return "";

        }else{

            Map<String, Integer> charStore = new LinkedHashMap<>(); // stores each chars and their amount
            StringBuilder sb = new StringBuilder();                 // stores chars + amount as String

            for (int i = 0; i < sentence.length(); i++) {

                String character = sentence.charAt(i) + "";         // String representation of the "sentence.charAt(i)"

                if(character.equals(" ")){

                    charStore.put("space", charStore.getOrDefault("space", 0) + 1);

                }else{

                    charStore.put(character, charStore.getOrDefault(character, 0) + 1);

                }

            }

            for(Map.Entry<String, Integer> entry : charStore.entrySet()) {  // iterates through the map to get keys & values

                sb.append(entry.getKey()).append("-");  // adds each key to the StringBuilder object "sb"
                sb.append(entry.getValue()).append(" ");// adds each value to the StringBuilder object "sb"

            }

            sb.deleteCharAt(sb.length() - 1);     // deletes the last, excessive space at the end of the "sb"

            return sb.toString();                       // returns the String result

        }

    }

}
