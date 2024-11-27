package Stepan;

public class Reverse {
    /* Write a return method that can Reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));    // output: DCBA
        System.out.println(reverse(""));        // output: ""
        System.out.println(reverse(null));      // output: null

    }

    public static String reverse(String input) {

        if (input == null || input.length() <= 1) {   // base case

            return input;

        } else {                                      // recursive call

            return reverse(input.substring(1)) + input.charAt(0);   // reduces recursive call and concatenates chars

        }

    }

}