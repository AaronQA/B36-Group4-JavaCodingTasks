package Mahrukh;

public class FindUnique {

     /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {
        System.out.println(uniqueCharacters("AAABBBCCCDEF"));
        System.out.println(uniqueCharacters("AARON"));
        System.out.println(uniqueCharacters("111222333456"));

        //negative testing
        //System.out.println(uniqueCharacters(""));   //output: error message and an exception
        //System.out.println(uniqueCharacters(" "));  //output: error message and an exception
        //System.out.println(uniqueCharacters(null)); //output: an exception


    }

    public static String uniqueCharacters(String str){

        if (str == null){
            throw new IllegalArgumentException("Please enter a valid string argument!");
        } else if (str.isEmpty() || str.isBlank() ) {
            System.err.println("String argument cannot be empty or blank");
            throw new IllegalArgumentException("Please enter a valid string argument!");
        }

        String uniqueChars = "";

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == eachChar){
                    count++;
                }
            }

            if (count == 1){
                uniqueChars += eachChar + "";
            }
        }

        return uniqueChars;
    }
}
