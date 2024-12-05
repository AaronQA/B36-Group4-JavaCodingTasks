package Elena;

public class Reverse {

    public static void main(String[] args) {

        System.out.println(reverseString(null));        // Output: null
        System.out.println(reverseString(""));          // Output: (empty string)
        System.out.println(reverseString("ABCD"));      // Output: DCBA
        System.out.println(revStr("Ooops"));                  // Output: spooO
        System.out.println(StrReverse("hello"));              // Output: olleh

    }

    public static String reverseString(String input) {
        if (input == null) return null;
        if (input.isEmpty()) return "";

        char[] reversed = new char[input.length()];

        for (int i = input.length() - 1, j = 0; i >= 0; i--, j++) {
            char currentChar = input.charAt(i);
            reversed[j] = currentChar;
        }
        return new String(reversed);
    }

    public static String revStr(String str) {
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        return reverse;
    }

    public static String StrReverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--)
            reverse += str.charAt(i);
        return reverse;
    }

}