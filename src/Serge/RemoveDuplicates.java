package Serge;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCC"));
    }



    public static String removeDuplicates(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (!output.contains(input.charAt(i) + "")) {
                output += "" + input.charAt(i);
            }
        }
        return output;
    }
}