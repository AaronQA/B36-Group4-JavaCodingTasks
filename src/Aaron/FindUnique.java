package Aaron;


import java.util.Arrays;
import java.util.Collections;

public class FindUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {
        System.out.println(Unique("AAABBBCCCDEF"));
        System.out.println(unique("AAABBBCCCDEF"));
        System.out.println(findUniqueCharacters("AAABBBCCCDEF"));
    }


    public static String Unique(String str) {
        String result = "";
        for (String each : str.split(""))
            result += ((Collections.frequency(Arrays.asList(str.split("")), each)) == 1) ? each : "";
        return result;
    }

    public static String unique(String str) {
        String[] arr = str.split("");
        String unique1 = "";
        for (int j = 0; j < arr.length; j++) {
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j]))
                    num++;
            }
            if (num == 1)
                unique1 += arr[j];
        }
        return unique1;
    }

    public static String findUniqueCharacters(String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) { //
            char each = str.charAt(i);
            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
            }
        }
        return unique;
    }

}