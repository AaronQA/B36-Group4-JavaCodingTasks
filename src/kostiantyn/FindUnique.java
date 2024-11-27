package kostiantyn;

import java.util.Arrays;
import java.util.Collections;

public class FindUnique {
      /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static String unique (String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++){
            char current = str.charAt(i);
            if ( str.indexOf(current) == str.lastIndexOf(current)) { //If the first and last occurrence indexes are the same, the character is unique in the string.
                result += current;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String result = unique("AAABBBCCCDEF");
        System.out.println(result); // Output: DEF
    }
    }



