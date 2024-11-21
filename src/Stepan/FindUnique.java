package Stepan;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindUnique {

    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {

        System.out.println("\n - - - - - uniquePrint method use - - - - - -\n");

        uniquePrint("AAABBBCCCDEF"); // output: Unique characters (3): | D | | E | | F |
        uniquePrint("a");            // output: Unique characters (1): | a |
        uniquePrint("");             // output: String is empty
        uniquePrint(null);           // output: String is null
        uniquePrint(" ");            // output: Unique characters (1): | space |
        uniquePrint("|");            // output: Unique characters (1): | pipe (or vertical bar) |

        System.out.println("\n - - - - - uniqueSort method use - - - - - -\n");

        System.out.println(uniqueSort("AAABBBCCCDEF")); // output: DEF
        System.out.println(uniqueSort("a"));            // output: a
        System.out.println(uniqueSort(""));             // output: String is empty
        //System.out.println(uniqueSort(null));               // output: Exception in thread "main" java.util.InputMismatchException
        System.out.println(uniqueSort(" "));            // output:
        System.out.println(uniqueSort("|"));            // output: |

        System.out.println("\n - - - - - your input test: - - - - - -\n");

        System.out.println("Enter your text: ");
        uniquePrint(new Scanner(System.in).nextLine());                     // for your input (uniquePrint)
        System.out.println("Enter your text: ");
        System.out.println(uniqueSort(new Scanner(System.in).nextLine()));  // for your input (uniqueSort)

    }

    public static void uniquePrint(String input) {              // the method prints out unique chars

        Map<Character, Integer> counts = new LinkedHashMap<>(); // contains keys as chars & values as their count
        StringBuilder sb = new StringBuilder();                 // String manipulator
        int charAmount = 0;                                     // counts unique chars

        if (input == null) {                                    // if String is null, prints out "String is null"

            System.out.println("String is null");

        } else if (input.isEmpty()) {                           // if String is empty, prints out "String is empty"

            System.out.println("String is empty");

        } else {                                                // else the process begins

            sb.append("Unique characters ():");

            for (int i = 0; i < input.length(); i++) {          // puts each char into the Map

                char letter = input.charAt(i);

                counts.put(letter, counts.getOrDefault(letter, 0) + 1); // updates each count

            }

            for (Map.Entry<Character, Integer> entry : counts.entrySet()) {        // adds unique chars to the StringBuilder

                if (entry.getValue() < 2) {

                    sb.append(" | ");

                    if (entry.getKey() == ' ') {                // if char is space

                        sb.append("space");

                    } else if (entry.getKey() == '|') {         // if char is pipe (the sign | )

                        sb.append("pipe (or vertical bar)");

                    } else {                                    // else just adds

                        sb.append(entry.getKey());

                    }

                    sb.append(" |");

                    charAmount++;

                }

            }

            System.out.println(sb.insert(sb.indexOf("(") + 1, charAmount)); // prints out the result

        }

    }

    public static String uniqueSort(String input) {                         // the method return unique chars

        Map<Character, Integer> counts = new LinkedHashMap<>();             // stores chars and their count
        StringBuilder sb = new StringBuilder();                             // String manipulator

        if (input == null) {                                                // if null = throw the exception

            System.err.println("!!! String is null !!!");

            throw new InputMismatchException("String must not be null");

        } else if (input.isEmpty()) {                                       // if empty String returns "String is empty"

            return "String is empty";

        } else {                                                            // else the process begins

            for (int i = 0; i < input.length(); i++) {                      // adds each char as key and their count as int

                char letter = input.charAt(i);

                counts.put(letter, counts.getOrDefault(letter, 0) + 1);

            }

            for (Map.Entry<Character, Integer> entry : counts.entrySet()) { // identifies chars with frequency of 1

                if (entry.getValue() < 2) {

                    sb.append(entry.getKey());

                }

            }

            return sb.toString();                                           // returns the sorted String

        }

    }

}
