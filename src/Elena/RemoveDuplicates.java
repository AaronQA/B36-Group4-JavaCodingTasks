package Elena;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static void main(String[] args) {
        System.out.println(remDup("eeennnnkkkDFppp")); // output: enkDFp
    }

    public static String remDup(String str) {

        // Initialize an empty string 'result' to store the unique characters.
        String result = "";

        // Loop through each character in the input string 'str'.
        for (int i = 0; i < str.length(); i++)

            // Check if the current character is not already present in 'result'.
            if (!result.contains("" + str.charAt(i)))

                // If the character is not present, append it to 'result'.
                result += "" + str.charAt(i);

        // Return the final string 'result' which contains only unique characters.
        return result;

    }
}