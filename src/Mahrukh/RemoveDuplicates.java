package Mahrukh;

import java.util.InputMismatchException;

public class RemoveDuplicates {

     /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static void main(String[] args){
        System.out.println(removeDuplicates("AAABBBCCC"));
        System.out.println(removeDuplicates("11111115555555000000004444"));
    }

    public static String removeDuplicates(String str){

        String nonDup = "";                                 // created an empty string to store unique characters

        for (int i = 0; i < str.length(); i++) {            // created a for loop to iterate through each character in a string
            char eachChar = str.charAt(i);

            if (nonDup.contains(eachChar+"")){              // created an if condition: if the nonDuplicated string contains the iterated
                continue;                                       // character, then the current iteration is skipped using the "continue" keyword
            }
            nonDup += eachChar + "";                        // if the nonDuplicated string does not have the iterated character,
        }                                                       // then that character is concatenated to the nonDuplicated String

        return nonDup;                                      // returns the unique string
    }
}
