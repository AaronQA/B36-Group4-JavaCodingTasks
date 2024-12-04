package Mahrukh;

public class Reverse {
    /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));
        System.out.println(reverse("API-JAVA"));

        //negative testing
        //System.out.println(reverse(""));   // output: error message and an exception
        //System.out.println(reverse(" "));  // output: error message and an exception
        //System.out.println(reverse(null)); // output: an exception

    }

    public static String reverse(String str){

        if (str == null){
            throw new IllegalArgumentException("Please enter a valid string argument!");
        } else if (str.isEmpty() || str.isBlank() ) {
            System.err.println("String argument cannot be empty or blank");
            throw new IllegalArgumentException("Please enter a valid string argument!");
        } else {
            String reverse = "";
            for (int i = str.length()-1; i >= 0; i--){
                reverse += str.charAt(i) + "";
            }
            return reverse;
        }
    }
}
