package kostiantyn;

public class Reverse {

        public static void main(String[] args) {
            System.out.println(reverse("ABCD"));
            System.out.println(reverse2("ABCD"));
        }

        public static String reverse (String in) {
            String out = "";

            for (int i = in.length() - 1; i >= 0; i--) {
                out += in.charAt(i);
            }

            return out;
        }


    public static String reverse2(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    }

