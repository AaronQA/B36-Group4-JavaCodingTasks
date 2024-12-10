package kostiantyn;

public class RemoveDuplicates {

    public static String removeDup(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String original = "AAABBBCCC";
        String withoutDuplicates = removeDup(original);
        System.out.println(withoutDuplicates);  // Output: ABC
    }
}
