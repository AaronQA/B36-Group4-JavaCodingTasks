package Serge;

public class FindUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {

        System.out.println(unique("AAABBBCCCDEF"));

    }




    public static String unique(String str) {

        String output = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

               if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                output += str.charAt(i);
            }
        }
        return output;
    }


}