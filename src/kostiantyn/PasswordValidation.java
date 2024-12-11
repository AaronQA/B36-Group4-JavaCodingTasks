package kostiantyn;

public class PasswordValidation {


        public static void main(String[] args) {
            System.out.println(isValidPassword("spoon"));
            System.out.println(isValidPassword("woodenspoon"));
            System.out.println(isValidPassword("WoodenSpoon"));
            System.out.println(isValidPassword("WoodenSpoon1"));
            System.out.println(isValidPassword("WoodenSpoon $1000000"));
            System.out.println(isValidPassword("WOODENSPOON$1000000"));
            System.out.println(isValidPassword("WoodenSpoon$1000000"));
        }

        public static boolean isValidPassword(String password) {
            if (password.length() < 6 || password.contains(" ")) {
                return false;
            }


            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasDigit = false;
            boolean hasSpecialChar = false;


            for (char each : password.toCharArray()) {
                if (Character.isUpperCase(each)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(each)) {
                    hasLowerCase = true;
                } else if (Character.isDigit(each)) {
                    hasDigit = true;
                } else if (!Character.isLetterOrDigit(each)) {
                    hasSpecialChar = true;
                }
            }

            return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
        }
    }
