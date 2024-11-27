package Stepan;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static void main(String[] args) {

        System.out.println(removeDupPlease("AAABBBCCC")); // output: ABC
        System.out.println(removeDupPlease("1"));         // output: 1
        System.out.println(removeDupPlease(""));          // output:

        System.out.println(removeDupPlease(new Scanner(System.in).nextLine())); //whatsoever!

    }

    public static String removeDupPlease(String input){

        Set<Character> noDup = new LinkedHashSet<>();   //deletes dup
        StringBuilder sb = new StringBuilder();         //contains new String
        int count = 0;                                  //counts everything in the World

        while(input.length()!=count){                   //deleting process

            noDup.add(input.charAt(count));

            count++;

        }

        for (Character each : noDup) {                  //appending process

            sb.append(each);

        }

        return sb.toString();                           //finally returns!

    }

}
