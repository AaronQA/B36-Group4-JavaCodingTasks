package jelena;

public class RemoveDuplicates {


    public static void main(String[] args) {

        System.out.println(removeDuplicates2("aaabbbbcccccjjjj"));

    }


    public static String removeDuplicates2(String string) {

        String result = "";

        for (int i = 0; i < string.length() ; i++) {
            if(result.contains( "" + string.charAt(i))) {
                continue;
            }
            result+=string.charAt(i);

        }

        return result;
    }


    }



